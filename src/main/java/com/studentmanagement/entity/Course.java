package com.studentmanagement.entity;

public class Course {
    private String courseId;
    private String title;
    private int credits;

    public Course() { }

    public Course(String courseId, String title, int credits) {
        this.courseId = courseId;
        this.title = title;
        this.credits = credits;
    }

    // Getters & Setters
    public String getCourseId() {
        return courseId;
    }
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{ ID=" + courseId +
                ", Title=" + title +
                ", Credits=" + credits +
                " }";
    }
}
