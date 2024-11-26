package com.siddheshdare.faculty_display_timetable.entity;
import jakarta.persistence.*;
import lombok.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course_schedule")
public class Course_Schedule {
    @Id
    private int id;
    @Column(name = "time", nullable = false)
    private String time;
    @Column(name = "day", nullable = false)
    private String day;
    @Column(name = "room", nullable = false)
    private String room;
    @Column(name = "building")
    private String building;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Courses course;
}

