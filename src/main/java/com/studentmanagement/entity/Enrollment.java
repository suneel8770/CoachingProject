package com.studentmanagement.entity;

public class Enrollment {
    private Student student;
    private Course course;
    private String enrollmentDate; // Simple string for beginner project

    public Enrollment() { }

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = "N/A";
    }

    // Getters & Setters
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }
    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return "Enrollment{ Student=" + student.getStudentId() +
                ", Course=" + course.getCourseId() +
                ", Date=" + enrollmentDate +
                " }";
    }
}
