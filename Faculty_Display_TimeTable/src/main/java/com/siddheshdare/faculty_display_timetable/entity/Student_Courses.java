package com.siddheshdare.faculty_display_timetable.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_courses")
public class Student_Courses {
    @Id
    private int id;

    @Column(name = "comments")
    private String comments;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Courses course;
}