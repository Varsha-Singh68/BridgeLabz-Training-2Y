CREATE DATABASE student_result_db;

USE student_result_db;

CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    email VARCHAR(150),
    dob DATE
);

CREATE TABLE results (
    result_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    subject VARCHAR(100),
    marks INT,
    grade VARCHAR(5),
    semester INT,
    FOREIGN KEY (student_id) REFERENCES students(student_id)
);














