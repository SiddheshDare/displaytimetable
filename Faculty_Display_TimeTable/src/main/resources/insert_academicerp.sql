-- Populate 'employees' table with 5 rows
INSERT INTO employees (employee_id, first_name, last_name, email, title, photograph_path) VALUES
(1, 'Alice', 'Johnson', 'alice.johnson@university.edu', 'Dr.', '/images/alice.jpg'),
(2, 'Bob', 'Smith', 'bob.smith@university.edu', 'Prof.', '/images/bob.jpg'),
(3, 'Carol', 'Brown', 'carol.brown@university.edu', 'Lecturer', '/images/carol.jpg'),
(4, 'David', 'Lee', 'david.lee@university.edu', 'Prof.', '/images/david.jpg'),
(5, 'Eve', 'Davis', 'eve.davis@university.edu', 'Asst. Prof.', '/images/eve.jpg');

-- Populate 'specialization' table with 5 rows
INSERT INTO specialization (specialization_id, code, name, description, year, credits_required) VALUES
(1, 'CS', 'Computer Science', 'Focus on software and systems', 2021, 30),
(2, 'EE', 'Electrical Engineering', 'Focus on circuits and design', 2021, 30),
(3, 'ME', 'Mechanical Engineering', 'Focus on machines and dynamics', 2021, 30),
(4, 'CE', 'Civil Engineering', 'Focus on infrastructure', 2021, 30),
(5, 'IT', 'Information Technology', 'Focus on IT systems', 2021, 30);

-- Populate 'students' table with 5 rows
INSERT INTO students (student_id, roll_number, first_name, last_name, email, photograph_path, cgpa, total_credits, graduation_year) VALUES
(1, 'STU001', 'John', 'Doe', 'john.doe@student.edu', '/images/john.jpg', 3.5, 120, '2023'),
(2, 'STU002', 'Jane', 'Smith', 'jane.smith@student.edu', '/images/jane.jpg', 3.8, 110, '2024'),
(3, 'STU003', 'Emma', 'Jones', 'emma.jones@student.edu', '/images/emma.jpg', 3.7, 100, '2025'),
(4, 'STU004', 'Chris', 'Taylor', 'chris.taylor@student.edu', '/images/chris.jpg', 3.2, 90, '2024'),
(5, 'STU005', 'Olivia', 'Miller', 'olivia.miller@student.edu', '/images/olivia.jpg', 3.9, 125, '2023');

-- Populate 'courses' table with 5 rows
INSERT INTO courses (course_id, course_code, name, description, year, term, credits, capacity) VALUES
(1, 'CS101', 'Intro to CS', 'Basic programming and algorithms', 2023, 'Fall', 3, 50),
(2, 'EE201', 'Circuit Analysis', 'Foundations of circuit design', 2023, 'Spring', 4, 40),
(3, 'ME301', 'Thermodynamics', 'Study of heat and energy systems', 2023, 'Fall', 3, 45),
(4, 'CE401', 'Structural Analysis', 'Principles of structure design', 2023, 'Spring', 4, 30),
(5, 'IT501', 'Network Security', 'Securing IT networks', 2023, 'Fall', 3, 50);

-- Populate 'student_courses' table with 5 rows
INSERT INTO student_courses (id,comments) VALUES
(1, 'Very interesting'),
(2, 'Good course'),
(3, 'Challenging concepts'),
(4, 'Detailed and engaging'),
(5, 'Exciting material');

-- Populate 'specialization_course' table with 5 rows
INSERT INTO specialization_course (id) VALUES
(1),
(2),
(3),
(4),
(5);

-- Populate 'course_schedule' table with 5 rows
INSERT INTO course_schedule (id, time, day, room, building) VALUES
(1, '09:00:00', 'Monday', '101', 'Main'),
(2, '10:30:00', 'Tuesday', '202', 'Engg'),
(3, '12:00:00', 'Wednesday', '303', 'Mechanical'),
(4, '13:30:00', 'Thursday', '404', 'Civil'),
(5, '15:00:00', 'Friday', '505', 'IT');


