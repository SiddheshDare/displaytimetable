package com.siddheshdare.faculty_display_timetable.service;

import com.siddheshdare.faculty_display_timetable.dto.CourseScheduleDTO;
import com.siddheshdare.faculty_display_timetable.dto.StudentDTO;
import com.siddheshdare.faculty_display_timetable.dto.UserDTO;
import com.siddheshdare.faculty_display_timetable.entity.Employees;
import com.siddheshdare.faculty_display_timetable.entity.User;
import com.siddheshdare.faculty_display_timetable.helper.EncryptionService;
import com.siddheshdare.faculty_display_timetable.repo.EmployeeRepo;
import com.siddheshdare.faculty_display_timetable.repo.UserRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    private final UserRepo userRepo;
    private final EncryptionService encryptionService;

    public void saveUser(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setPassword(encryptionService.encode(userDTO.getPassword()));
        userRepo.save(user);
    }

    @PersistenceContext
    private EntityManager entityManager;


    public Employees getEmployeeByEmail(String email) {
        return employeeRepo.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found"));
    }

    public List<CourseScheduleDTO> getFacultyTimetable(Integer facultyId) {
        String query = "SELECT new com.siddheshdare.faculty_display_timetable.dto.CourseScheduleDTO(" +
                "c.course_id, c.course_code, c.name, cs.time, cs.day, cs.room, s.name) " +
                "FROM Courses c " +
                "JOIN c.courseSchedules cs " +
                "JOIN c.specializationCourses sc " +
                "JOIN sc.specialization s " +
                "WHERE c.faculty.employee_id = :facultyId";

        return entityManager.createQuery(query, CourseScheduleDTO.class)
                .setParameter("facultyId", facultyId)
                .getResultList();
    }

    public List<StudentDTO> getEnrolledStudents(Long courseId) {
        String query = "SELECT new com.siddheshdare.faculty_display_timetable.dto.StudentDTO(" +
                "st.student_id, st.rollNumber, st.firstName, st.lastName, st.email)" +
                "FROM Student st " +
                "JOIN st.studentCourses sc " +
                "JOIN sc.course c " +
                "JOIN st.specialization sp " +
                "WHERE c.course_id = :courseId";

        return entityManager.createQuery(query, StudentDTO.class)
                .setParameter("courseId", courseId)
                .getResultList();
    }
}