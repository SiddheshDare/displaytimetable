-- Add foreign key constraints to the 'student_courses' table
ALTER TABLE student_courses
ADD COLUMN student_id INT,
ADD COLUMN course_id INT,
ADD FOREIGN KEY (student_id) REFERENCES students(student_id),
ADD FOREIGN KEY (course_id) REFERENCES courses(course_id);

-- Add a foreign key constraint to the 'course_schedule' table
ALTER TABLE course_schedule
ADD COLUMN course_id INT,
ADD FOREIGN KEY (course_id) REFERENCES courses(course_id);


-- Add a foreign key constraint to the 'students' table
ALTER TABLE students
ADD COLUMN specialization INT,
ADD FOREIGN KEY (specialization) REFERENCES specialization(specialization_id);

-- Add a foreign key constraint to the 'specialization_course' table
ALTER TABLE specialization_course
ADD COLUMN specialization_id INT,
ADD COLUMN course_id INT,
ADD FOREIGN KEY (specialization_id) REFERENCES specialization(specialization_id),
ADD FOREIGN KEY (course_id) REFERENCES courses(course_id);

