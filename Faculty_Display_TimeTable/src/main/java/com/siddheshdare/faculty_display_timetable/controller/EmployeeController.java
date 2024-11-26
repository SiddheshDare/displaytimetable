package com.siddheshdare.faculty_display_timetable.controller;

import com.siddheshdare.faculty_display_timetable.dto.StudentDTO;
import com.siddheshdare.faculty_display_timetable.dto.UserDTO;
import com.siddheshdare.faculty_display_timetable.entity.Employees;
import com.siddheshdare.faculty_display_timetable.helper.JWTHelper;
import com.siddheshdare.faculty_display_timetable.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class EmployeeController {
    private final EmployeeService employeeService;
    private final JWTHelper jwtHelper;

    @PostMapping("/users")
    public ResponseEntity<String> saveUser(@RequestBody UserDTO userDTO) {
        employeeService.saveUser(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
    }
    
    @GetMapping("/timetable")
    public ResponseEntity<?> getFacultyTimetable(@RequestHeader("Authorization") String token) {
        if (token == null || !token.startsWith("Bearer ")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not authenticated");
        }
        String jwt = token.substring(7);
        String email = jwtHelper.extractUsername(jwt);
        Employees employee = employeeService.getEmployeeByEmail(email);
        if (employee == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not authenticated");
        }
        return ResponseEntity.ok(employeeService.getFacultyTimetable(employee.getEmployee_id()));
    }

    @GetMapping("/courses/{courseId}/students")
    public ResponseEntity<List<StudentDTO>> getEnrolledStudents(@PathVariable Long courseId) {
        return ResponseEntity.ok(employeeService.getEnrolledStudents(courseId));
    }
}