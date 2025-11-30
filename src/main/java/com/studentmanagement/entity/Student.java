package com.studentmanagement.entity;

public class Student extends Person {
    private String studentId;
    private String courseName;

    public Student() { }

    public Student(String name, int age, String studentId, String courseName) {
        super(name, age);
        this.studentId = studentId;
        this.courseName = courseName;
    }

    // Getters & Setters
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{ " + super.toString() +
                ", StudentID = " + studentId +
                ", Course = " + courseName +
                " }";
    }
}
