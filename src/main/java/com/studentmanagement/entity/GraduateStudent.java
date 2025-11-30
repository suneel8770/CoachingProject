package com.studentmanagement.entity;

public class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent() { }

    public GraduateStudent(String name, int age, String studentId, String courseName, String thesisTopic) {
        super(name, age, studentId, courseName);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }
    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

    @Override
    public String toString() {
        return "GraduateStudent{ " + super.toString() +
                ", Thesis = " + thesisTopic +
                " }";
    }
}
