package com.siddheshdare.faculty_display_timetable.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courses")
public class Courses {
    @Id
    private Integer course_id;

    @Column(name = "course_code", nullable = false, unique = true)
    private String course_code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "term", nullable = false)
    private String term;

    @Column(name = "credits", nullable = false)
    private int credits;

    @Column(name = "capacity", nullable = false)
    private int capacity;

    @ManyToOne
    @JoinColumn(name = "faculty", referencedColumnName = "employee_id")
    private Employees faculty;

    @OneToMany(mappedBy = "course")
    private List<Course_Schedule> courseSchedules;

    @OneToMany(mappedBy = "course")
    private List<Student_Courses> studentCourses;

    @OneToMany(mappedBy = "course")
    private List<Specialization_Course> specializationCourses;
}