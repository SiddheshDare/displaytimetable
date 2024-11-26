package com.siddheshdare.faculty_display_timetable.entity;
import jakarta.persistence.*;
import lombok.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "specialization_course")
public class Specialization_Course {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "specialization_id", nullable = false)
    private Specialization specialization;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Courses course;

}
