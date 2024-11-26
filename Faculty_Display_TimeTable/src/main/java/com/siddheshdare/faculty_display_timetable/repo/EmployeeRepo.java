package com.siddheshdare.faculty_display_timetable.repo;

import com.siddheshdare.faculty_display_timetable.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employees, Long> {
    Optional<Employees> findByEmail(String email);
}