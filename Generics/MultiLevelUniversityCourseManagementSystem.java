package generic;

import java.util.*;

abstract class CourseType {
    String name;
    CourseType(String name) { this.name = name; }
    public String toString() { return name; }
}

class ExamCourse extends CourseType {
    ExamCourse() { super("Exam-Based"); }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse() { super("Assignment-Based"); }
}

class ResearchCourse extends CourseType {
    ResearchCourse() { super("Research-Based"); }
}

class Course<T extends CourseType> {
    String title;
    T type;

    Course(String title, T type) {
        this.title = title;
        this.type = type;
    }

    public String toString() {
        return title + " - " + type;
    }
}

class CourseUtil {
    public static void displayCourses(List<? extends CourseType> types) {
        for (CourseType t : types) System.out.println(t);
    }
}

public class MultiLevelUniversityCourseManagementSystem {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Mathematics", new ExamCourse());
        Course<AssignmentCourse> programming = new Course<>("Programming", new AssignmentCourse());
        Course<ResearchCourse> aiResearch = new Course<>("AI Research", new ResearchCourse());

        List<CourseType> courseTypes = Arrays.asList(
            math.type,
            programming.type,
            aiResearch.type
        );

        CourseUtil.displayCourses(courseTypes);
    }
}

