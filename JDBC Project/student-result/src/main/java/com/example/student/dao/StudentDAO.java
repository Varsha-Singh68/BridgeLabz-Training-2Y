package com.example.student.dao;

import com.example.student.database.DatabaseManager;
import com.example.student.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public boolean addStudent(Student s) {
        String q = "INSERT INTO students (first_name, last_name, email, dob) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(q)) {

            stmt.setString(1, s.getFirstName());
            stmt.setString(2, s.getLastName());
            stmt.setString(3, s.getEmail());
            stmt.setString(4, s.getDob());
            return stmt.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Add student error: " + e.getMessage());
            return false;
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String q = "SELECT * FROM students";

        try (Connection conn = DatabaseManager.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(q)) {

            while (rs.next()) {
                list.add(new Student(
                        rs.getInt("student_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("dob")
                ));
            }

        } catch (Exception e) {
            System.out.println("Fetch error: " + e.getMessage());
        }

        return list;
    }

   
    public boolean updateStudent(int id, String fn, String ln, String email, String dob) {
        String q = "UPDATE students SET first_name=?, last_name=?, email=?, dob=? WHERE student_id=?";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(q)) {

            stmt.setString(1, fn);
            stmt.setString(2, ln);
            stmt.setString(3, email);
            stmt.setString(4, dob);
            stmt.setInt(5, id);

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Update error: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteStudent(int id) {
        String q = "DELETE FROM students WHERE student_id=?";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(q)) {

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Delete error: " + e.getMessage());
            return false;
        }
    }
}


