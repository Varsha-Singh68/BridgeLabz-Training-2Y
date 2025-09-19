package object_relationships;

import java.util.*;

class Professor {
    private String name;
    private List<Course_> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course_ course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this);
        }
    }

    public void showCourses() {
        System.out.println("Professor: " + name + " teaches:");
        for (Course_ c : courses) {
            System.out.println(c.getCourseName());
        }
        System.out.println();
    }
}

class Student_ {
    private String name;
    private List<Course_> courses;

    public Student_(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course_ course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void showCourses() {
        System.out.println("Student: " + name + " enrolled in:");
        for (Course_ c : courses) {
            System.out.println(c.getCourseName());
        }
        System.out.println();
    }
}

class Course_ {
    private String courseName;
    private Professor professor;
    private List<Student_> students;

    public Course_(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student_ student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("Professor: Not assigned");
        }
        System.out.println("Students:");
        for (Student_ s : students) {
            System.out.println(s.getName());
        }
        System.out.println();
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Course_ c1 = new Course_("DSA");
        Course_ c2 = new Course_("Frontend");
        Professor p1 = new Professor("Prof. Mahesh");
        Professor p2 = new Professor("Prof. John");
        Student_ s1 = new Student_("Varsha");
        Student_ s2 = new Student_("Riya");
        p1.assignCourse(c1);
        p2.assignCourse(c2);
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);
        s1.showCourses();
        s2.showCourses();
        p1.showCourses();
        p2.showCourses();
        c1.showDetails();
        c2.showDetails();
    }
}
