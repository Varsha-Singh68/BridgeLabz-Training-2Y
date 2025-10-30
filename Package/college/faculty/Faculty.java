package college.faculty;

public class Faculty {
    private String name;
    private String subject;

    // Constructor to initialize faculty details
    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // Method to display faculty name
    public void displayName() {
        System.out.println("Faculty Name: " + name);
    }

    // Method to display subject
    public void displaySubject() {
        System.out.println("Subject: " + subject);
    }
}
