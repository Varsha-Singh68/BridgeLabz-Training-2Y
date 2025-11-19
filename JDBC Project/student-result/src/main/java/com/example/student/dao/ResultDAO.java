package com.example.student.dao;

import com.example.student.database.DatabaseManager;
import com.example.student.model.Result;

import java.sql.*;
import java.util.*;

public class ResultDAO {

    public boolean addResult(Result r) {
        String q = "INSERT INTO results (student_id, subject, marks, grade, semester) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(q)) {

            stmt.setInt(1, r.getStudentId());
            stmt.setString(2, r.getSubject());
            stmt.setInt(3, r.getMarks());
            stmt.setString(4, r.getGrade());
            stmt.setInt(5, r.getSemester());

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Add result error: " + e.getMessage());
            return false;
        }
    }

    public List<Result> getAllResults() {
        List<Result> list = new ArrayList<>();
        String q = "SELECT * FROM results";

        try (Connection conn = DatabaseManager.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(q)) {

            while (rs.next()) {
                list.add(new Result(
                        rs.getInt("result_id"),
                        rs.getInt("student_id"),
                        rs.getString("subject"),
                        rs.getInt("marks"),
                        rs.getString("grade"),
                        rs.getInt("semester")
                ));
            }

        } catch (Exception e) {
            System.out.println("Fetch error: " + e.getMessage());
        }

        return list;
    }

    
    public boolean updateResult(int id, int sid, String subject, int marks, String grade, int sem) {
        String q = "UPDATE results SET student_id=?, subject=?, marks=?, grade=?, semester=? WHERE result_id=?";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(q)) {

            stmt.setInt(1, sid);
            stmt.setString(2, subject);
            stmt.setInt(3, marks);
            stmt.setString(4, grade);
            stmt.setInt(5, sem);
            stmt.setInt(6, id);

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Update result error: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteResult(int id) {
        String q = "DELETE FROM results WHERE result_id=?";

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

