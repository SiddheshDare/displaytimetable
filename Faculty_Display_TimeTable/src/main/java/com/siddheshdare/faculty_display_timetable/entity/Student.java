package com.siddheshdare.faculty_display_timetable.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    private Integer student_id;

    @Column(name = "roll_number", nullable = false, unique = true)
    private String rollNumber;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "photograph_path")
    private String photographPath;

    @Column(name = "cgpa", nullable = false)
    private double cgpa = 0.0;

    @Column(name = "total_credits", nullable = false)
    private int totalCredits;

    @Column(name = "graduation_year")
    private String graduationYear;

    @ManyToOne
    @JoinColumn(name = "specialization", nullable = false)
    private Specialization specialization;

    @OneToMany(mappedBy = "student")
    private List<Student_Courses> studentCourses;
}