package com.siddheshdare.faculty_display_timetable.dto;

import lombok.Data;

@Data
public class StudentDTO {
    private Integer studentId;
    private String rollNumber;
    private String firstName;
    private String lastName;
    private String email;
//    private String photographPath;
//    private double cgpa;
//    private int totalCredits;
//    private String graduationYear;
//    private String specializationName;

    public StudentDTO(Integer studentId, String rollNumber, String firstName, String lastName, String email) {
        this.studentId = studentId;
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
//        this.photographPath = photographPath;
//        this.cgpa = cgpa;
//        this.totalCredits = totalCredits;
//        this.graduationYear = graduationYear;
//        this.specializationName = specializationName;
    }
}