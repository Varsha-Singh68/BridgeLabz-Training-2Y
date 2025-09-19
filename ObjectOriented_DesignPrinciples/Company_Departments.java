package object_relationships;

import java.util.*;

class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
}

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
    }

    public void displayEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            System.out.println(e.getName() + " - " + e.getPosition());
        }
        System.out.println();
    }

    public void clearEmployees() {
        employees.clear();
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public Department addDepartment(String deptName) {
        Department d = new Department(deptName);
        departments.add(d);
        return d;
    }

    public void displayCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayEmployees();
        }
    }

    public void closeCompany() {
        for (Department d : departments) {
            d.clearEmployees();
        }
        departments.clear();
        System.out.println("Company " + companyName + " closed. All departments and employees removed.");
    }
}

public class Company_Departments {
    public static void main(String[] args) {
        Company company = new Company("Microsoft");
        Department d1 = company.addDepartment("Marketing");
        Department d2 = company.addDepartment("Software");
        d1.addEmployee("Rahul", "Digital Marketer");
        d1.addEmployee("Mahesh", "Public Relations Manager");
        d2.addEmployee("Dinesh", "Frontend Developer");
        d2.addEmployee("Rajesh", "Backend Developer");
        company.displayCompanyStructure();
        company.closeCompany();
    }
}

