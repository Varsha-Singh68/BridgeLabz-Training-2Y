package generic;

import java.util.*;

abstract class JobRole {
    String role;
    JobRole(String role) { this.role = role; }
    public String toString() { return role; }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() { super("Software Engineer"); }
}

class DataScientist extends JobRole {
    DataScientist() { super("Data Scientist"); }
}

class ProductManager extends JobRole {
    ProductManager() { super("Product Manager"); }
}

class Resume<T extends JobRole> {
    String candidateName;
    T role;

    Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    public String toString() {
        return candidateName + " applying for " + role;
    }
}

class ScreeningUtil {
    public static void processPipeline(List<? extends JobRole> roles) {
        for (JobRole r : roles) System.out.println("Screening: " + r);
    }
}

public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>("Amit", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Riya", new DataScientist());
        Resume<ProductManager> r3 = new Resume<>("Karan", new ProductManager());

        List<JobRole> pipeline = Arrays.asList(
            r1.role,
            r2.role,
            r3.role
        );

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        ScreeningUtil.processPipeline(pipeline);
    }
}

