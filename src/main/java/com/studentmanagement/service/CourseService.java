package com.studentmanagement.service;

import com.studentmanagement.entity.Course;
import com.studentmanagement.exception.InvalidDataException;
import com.studentmanagement.exception.StudentNotFoundException;
import com.studentmanagement.util.InputValidator;

import java.util.HashMap;
import java.util.Map;

public class CourseService {

    private Map<String, Course> courseMap = new HashMap<>();

    // Add course
    public void addCourse(Course course) {
        if (!InputValidator.isValidCourse(course)) {
            throw new InvalidDataException("Invalid course data");
        }

        courseMap.put(course.getCourseId(), course);
        System.out.println("Course added successfully.");
    }

    // Get course
    public Course getCourse(String courseId) {
        if (!courseMap.containsKey(courseId)) {
            throw new StudentNotFoundException("Course not found: " + courseId);
        }
        return courseMap.get(courseId);
    }

    // Update course
    public void updateCourse(Course updatedCourse) {
        String id = updatedCourse.getCourseId();

        if (!courseMap.containsKey(id)) {
            throw new StudentNotFoundException("Cannot update — course not found.");
        }

        if (!InputValidator.isValidCourse(updatedCourse)) {
            throw new InvalidDataException("Invalid course data.");
        }

        courseMap.put(id, updatedCourse);
        System.out.println("Course updated successfully.");
    }

    // Delete course
    public void removeCourse(String courseId) {
        if (!courseMap.containsKey(courseId)) {
            throw new StudentNotFoundException("Cannot delete — course not found.");
        }

        courseMap.remove(courseId);
        System.out.println("Course removed successfully.");
    }

    // List all courses
    public void listAllCourses() {
        if (courseMap.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        for (Course c : courseMap.values()) {
            System.out.println(c);
        }
    }
}
