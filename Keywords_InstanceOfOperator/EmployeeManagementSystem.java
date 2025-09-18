package keywords;

class Employee {
    private static String companyName = "Green Spark Ventures";
    private static int totalEmployees = 0;
    private String name;
    private final String id;
    private String designation;
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee Details");
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
            
        } else {
            System.out.println("Invalid object. Not an Employee.");
        }
    }

    public String getId() {
        return id;
    }

    public static void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Person1", "E101", "Web Developer");
        Employee emp2 = new Employee("Person2", "E102", "Data Scientist");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        Employee.displayTotalEmployees();
        System.out.println("Employee 1 ID (using getter): " + emp1.getId());
        Employee.setCompanyName("Eco Rise Ventures");
        System.out.println("\nAfter Changing Company Name:");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
