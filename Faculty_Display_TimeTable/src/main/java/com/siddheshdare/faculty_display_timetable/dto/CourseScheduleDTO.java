package com.siddheshdare.faculty_display_timetable.dto;

import lombok.Data;

@Data
public class CourseScheduleDTO {
    private int course_id;
    private String courseCode;
    private String courseName;
    private String time;
    private String day;
    private String room;
//    private String building;
    private String specialization;

    public CourseScheduleDTO(int course_id, String courseCode, String courseName, String time, String day, String room, String specialization) {
        this.course_id = course_id;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.time = time;
        this.day = day;
        this.room = room;
//        this.building = building;
        this.specialization = specialization;
    }
}