package com.siddheshdare.faculty_display_timetable.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employees {
    @Id
    private Integer employee_id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "title", nullable = false, unique = true)
    private String title;

    @Column(name = "photograph_path")
    private String photographPath;

    @OneToMany(mappedBy = "faculty")
    private List<Courses> courses;
}