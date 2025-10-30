package com.university.department.cse;

public class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}

