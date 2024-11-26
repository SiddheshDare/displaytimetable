package com.siddheshdare.faculty_display_timetable.repo;

import com.siddheshdare.faculty_display_timetable.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface StudentRepo extends JpaRepository<Student, Long> {
}