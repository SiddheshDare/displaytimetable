package com.siddheshdare.faculty_display_timetable.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "specialization")
public class Specialization {
    @Id
    private int specialization_id;
    @Column(name = "code", nullable = false, unique = true)
    private String code;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "year", nullable = false)
    private int year;
    @Column(name = "credits_required", nullable = false)
    private int creditsRequired;

    @OneToMany(mappedBy = "specialization")
    private List<Student> students;

    @OneToMany(mappedBy = "specialization")
    private List<Specialization_Course> specializationCourses;
}
