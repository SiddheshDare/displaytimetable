-- Create the 'students' table
CREATE TABLE students (
    student_id INT PRIMARY KEY, 
    roll_number VARCHAR(20) UNIQUE NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100),
    email VARCHAR(100) UNIQUE NOT NULL,
    photograph_path VARCHAR(255),                          
    cgpa DOUBLE DEFAULT 0.0 NOT NULL,
    total_credits INT NOT NULL,
    graduation_year VARCHAR(4)
);

-- Create the 'courses' table
CREATE TABLE courses (
    course_id INT PRIMARY KEY, 
    course_code VARCHAR(20) UNIQUE NOT NULL,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(255),  
    year INT NOT NULL,
    term VARCHAR(20) NOT NULL,
    faculty INT,
    credits INT NOT NULL,
    capacity INT NOT NULL
);

-- Create the 'employee' table
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100),
    email VARCHAR(100) UNIQUE NOT NULL,
    title VARCHAR(20),
    photograph_path VARCHAR(255)
);

-- Create the 'course_Schedule' table
CREATE TABLE course_schedule (
    id INT PRIMARY KEY,
    time VARCHAR(50) NOT NULL,
    day VARCHAR(10) NOT NULL,
    room VARCHAR(10) NOT NULL,
    building VARCHAR(10)
);

-- Create the 'specialization' table
CREATE TABLE specialization (
    specialization_id INT PRIMARY KEY,
    code VARCHAR(20) UNIQUE NOT NULL,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(255),
    year INT NOT NULL,
    credits_required INT NOT NULL
);

-- Create the 'student_courses' table
CREATE TABLE student_courses (
    id INT PRIMARY KEY,
    comments VARCHAR(255)
);

-- Create the 'specialization_course' table
CREATE TABLE specialization_course (
    id INT PRIMARY KEY
);

CREATE TABLE users (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       email VARCHAR(100) UNIQUE NOT NULL,
                       password VARCHAR(255) NOT NULL
);