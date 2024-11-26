package com.siddheshdare.faculty_display_timetable.repo;

import com.siddheshdare.faculty_display_timetable.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CourseRepo extends JpaRepository<Courses, Long> {

}
