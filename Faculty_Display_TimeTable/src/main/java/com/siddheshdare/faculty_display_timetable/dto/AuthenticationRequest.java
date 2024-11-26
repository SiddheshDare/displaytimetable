package com.siddheshdare.faculty_display_timetable.dto;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email;
    private String password;
}