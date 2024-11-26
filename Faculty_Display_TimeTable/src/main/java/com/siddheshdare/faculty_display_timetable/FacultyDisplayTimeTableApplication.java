package com.siddheshdare.faculty_display_timetable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude ={SecurityAutoConfiguration.class})
public class FacultyDisplayTimeTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacultyDisplayTimeTableApplication.class, args);
    }

}
