package com.studentmanagement.main;

import com.studentmanagement.entity.*;

public class Main {
    public static void main(String[] args) {

        // Create Student
        Student s1 = new Student("Suneel", 22, "ST101", "Computer Science");

        // Create GraduateStudent (optional)
        GraduateStudent gs1 = new GraduateStudent("Rahul", 23, "ST102",
                "AI & ML", "Deep Learning Research");

        // Create Course
        Course c1 = new Course("CSE101", "Data Structures", 4);

        // Enrollment
        Enrollment e1 = new Enrollment(s1, c1, "2025-11-25");

        // Print Output
        System.out.println(s1);
        System.out.println(gs1);
        System.out.println(c1);
        System.out.println(e1);
    }
}
