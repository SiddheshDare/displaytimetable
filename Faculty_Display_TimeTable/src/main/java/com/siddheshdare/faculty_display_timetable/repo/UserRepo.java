package com.siddheshdare.faculty_display_timetable.repo;

import com.siddheshdare.faculty_display_timetable.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}