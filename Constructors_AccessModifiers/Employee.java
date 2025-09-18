package constructors;

class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID (public): " + employeeID);
        System.out.println("Department (protected): " + department);
        System.out.println("Salary (via getter): ₹" + getSalary());
        System.out.println("Team Size: " + teamSize);
    }
}

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Finance", 45000);
        e1.displayEmployeeDetails();
        System.out.println();

        e1.setSalary(50000);
        System.out.println("After Salary Update:");
        e1.displayEmployeeDetails();
        System.out.println();

        Manager m1 = new Manager(201, "IT", 75000, 10);
        m1.displayManagerDetails();
    }
}
