package object_relationships;
import java.util.*;

class Faculty {
    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}

class Department_ {
    private String deptName;

    public Department_(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

class University {
    private String universityName;
    private List<Department_> departments;
    private List<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department_(deptName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showStructure() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department_ d : departments) {
            System.out.println(d.getDeptName());
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println(f.getName() + " - " + f.getSpecialization());
        }
        System.out.println();
    }

    public void closeUniversity() {
        departments.clear();
        System.out.println("University " + universityName + " closed. All departments removed.");
    }
}

public class University_Faculties {
    public static void main(String[] args) {
        University university = new University("GLA University");
        university.addDepartment("Computer Science");
        university.addDepartment("Mathematics");
        Faculty f1 = new Faculty("Prof. Aman", "Python");
        Faculty f2 = new Faculty("Prof. Vijay", "Discrete Mathematics");
        university.addFaculty(f1);
        university.addFaculty(f2);
        university.showStructure();
        university.closeUniversity();
        university.showStructure();
        System.out.println("Faculty members still exist independently:");
        System.out.println(f1.getName() + " - " + f1.getSpecialization());
        System.out.println(f2.getName() + " - " + f2.getSpecialization());
    }
}

