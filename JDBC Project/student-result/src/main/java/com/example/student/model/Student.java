package com.example.student.model;

public class Student {
	
	

    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String dob;

    public Student(int studentId, String firstName, String lastName, String email, String dob) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
       	this.dob = dob;
    }

    public Student(String firstName, String lastName, String email, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
       	this.dob = dob;
    }

    
    public int getStudentId() { return studentId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getDob() { return dob; }

    
    public void setStudentId(int id) { this.studentId = id; }
    public void setFirstName(String fn) { this.firstName = fn; }
    public void setLastName(String ln) { this.lastName = ln; }
    public void setEmail(String email) { this.email = email; }
    public void setDob(String dob) { this.dob = dob; }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }

}
