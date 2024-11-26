package com.siddheshdare.faculty_display_timetable.controller;

import com.siddheshdare.faculty_display_timetable.dto.AuthenticationRequest;
import com.siddheshdare.faculty_display_timetable.helper.JWTHelper;
import com.siddheshdare.faculty_display_timetable.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class AuthController {

    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    private final JWTHelper jwtHelper;

    @PostMapping("/login")
    public String login(@RequestBody AuthenticationRequest request) {
        var user = userRepo.findByEmail(request.getEmail());
        if (user != null && passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            return jwtHelper.generateToken(user.getEmail());
        }
        throw new RuntimeException("Invalid credentials");
    }
}