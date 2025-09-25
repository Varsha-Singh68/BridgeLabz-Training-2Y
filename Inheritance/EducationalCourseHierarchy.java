package inheritance;

class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayInfo() {
        System.out.println("Online Course: " + courseName + ", Duration: " + duration + " weeks, Platform: " + platform + ", Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayInfo() {
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Paid Online Course: " + courseName + ", Duration: " + duration + " weeks, Platform: " + platform + ", Recorded: " + isRecorded + ", Fee: " + fee + ", Discount: " + discount + "%, Final Fee: " + finalFee);
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course course = new Course("OOP Basics", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 8, "Coursera", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Full Stack Development", 12, "Udemy", true, 5000, 20);

        course.displayInfo();
        onlineCourse.displayInfo();
        paidCourse.displayInfo();
    }
}

