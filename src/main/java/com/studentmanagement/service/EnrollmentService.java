package com.studentmanagement.service;

import com.studentmanagement.entity.Enrollment;
import com.studentmanagement.entity.Student;
import com.studentmanagement.entity.Course;
import com.studentmanagement.exception.InvalidDataException;
import com.studentmanagement.exception.StudentNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {

    private List<Enrollment> enrollmentList = new ArrayList<>();

    private StudentService studentService;
    private CourseService courseService;

    // Dependency injection
    public EnrollmentService(StudentService studentService, CourseService courseService) {
        this.studentService = studentService;
        this.courseService = courseService;
    }

    // Enroll student to course
    public void enrollStudent(String studentId, String courseId) {
        Student student = studentService.getStudent(studentId);
        Course course = courseService.getCourse(courseId);

        if (student == null || course == null) {
            throw new InvalidDataException("Enrollment failed — invalid student or course.");
        }

        Enrollment enrollment = new Enrollment(student, course);
        enrollmentList.add(enrollment);

        System.out.println("Student enrolled successfully.");
    }

    // List all enrollments
    public void listAllEnrollments() {
        if (enrollmentList.isEmpty()) {
            System.out.println("No enrollments found.");
            return;
        }

        for (Enrollment e : enrollmentList) {
            System.out.println(e);
        }
    }

    // Get enrollment by student
    public void getEnrollmentsByStudent(String studentId) {
        boolean found = false;

        for (Enrollment e : enrollmentList) {
            if (e.getStudent().getStudentId().equals(studentId)) {
                System.out.println(e);
                found = true;
            }
        }

        if (!found) {
            throw new StudentNotFoundException("No enrollments found for this student.");
        }
    }
}
