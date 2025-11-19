package com.example.student.model;

public class Result {

    private int resultId;
    private int studentId;
    private String subject;
    private int marks;
    private String grade;
    private int semester;
    
    @Override
    public String toString() {
        return "Result{" +
                "resultId=" + resultId +
                ", studentId=" + studentId +
                ", subject='" + subject + '\'' +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                ", semester=" + semester +
                '}';
    }

    

    public Result(int resultId, int studentId, String subject, int marks, String grade, int semester) {
        this.resultId = resultId;
        this.studentId = studentId;
        this.subject = subject;
        this.marks = marks;
        this.grade = grade;
        this.semester = semester;
    }

    public Result(int studentId, String subject, int marks, String grade, int semester) {
        this.studentId = studentId;
        this.subject = subject;
        this.marks = marks;
        this.grade = grade;
        this.semester = semester;
    }

    
    public int getResultId() { return resultId; }
    public int getStudentId() { return studentId; }
    public String getSubject() { return subject; }
    public int getMarks() { return marks; }
    public String getGrade() { return grade; }
    public int getSemester() { return semester; }

    
    public void setResultId(int id) { this.resultId = id; }
    public void setStudentId(int id) { this.studentId = id; }
}

