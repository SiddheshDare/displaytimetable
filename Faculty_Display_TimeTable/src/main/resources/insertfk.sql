-- Insert data into 'students' table
INSERT INTO students (specialization) VALUES
(101),
(102),
(103),
(104),
(105);

-- Insert data into 'courses' table
INSERT INTO courses (faculty) VALUES
(1),
(2),
(3),
(4),
(5);

-- Insert data into 'student_courses' table
INSERT INTO student_courses (student_id, course_id) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);

-- Insert data into 'course_schedule' table
INSERT INTO course_schedule (course_id) VALUES
(1),
(2),
(3),
(4),
(5);

-- Insert data into 'specialization_course' table
INSERT INTO specialization_course (specialization_id, course_id) VALUES
(101, 1),
(102, 2),
(103, 3),
(104, 4),
(105, 5);