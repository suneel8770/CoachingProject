package com.studentmanagement.service;

import com.studentmanagement.entity.Student;
import com.studentmanagement.exception.StudentNotFoundException;
import com.studentmanagement.exception.InvalidDataException;
import com.studentmanagement.util.InputValidator;

import java.util.HashMap;
import java.util.Map;

public class StudentService {

    // Data stored in-memory (as per coaching assignment)
    private Map<String, Student> studentMap = new HashMap<>();

    // Create - Add new student
    public void addStudent(Student student) {
        if (!InputValidator.isValidStudent(student)) {
            throw new InvalidDataException("Invalid student data");
        }

        studentMap.put(student.getStudentId(), student);
        System.out.println("Student added successfully.");
    }

    // Read - Get student by ID
    public Student getStudent(String studentId) {
        if (!studentMap.containsKey(studentId)) {
            throw new StudentNotFoundException("Student not found: " + studentId);
        }
        return studentMap.get(studentId);
    }

    // Update - Modify existing student
    public void updateStudent(Student updatedStudent) {
        String id = updatedStudent.getStudentId();

        if (!studentMap.containsKey(id)) {
            throw new StudentNotFoundException("Cannot update — student not found.");
        }

        if (!InputValidator.isValidStudent(updatedStudent)) {
            throw new InvalidDataException("Invalid student data.");
        }

        studentMap.put(id, updatedStudent);
        System.out.println("Student updated successfully.");
    }

    // Delete - Remove student by ID
    public void removeStudent(String studentId) {
        if (!studentMap.containsKey(studentId)) {
            throw new StudentNotFoundException("Cannot delete — student not found.");
        }

        studentMap.remove(studentId);
        System.out.println("Student removed successfully.");
    }

    // List all students
    public void listAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : studentMap.values()) {
            System.out.println(s);
        }
    }

    // Search student by name or id
    public void searchStudent(String keyword) {
        boolean found = false;

        for (Student s : studentMap.values()) {
            if (
                    s.getStudentId().equalsIgnoreCase(keyword) ||
                            s.getName().toLowerCase().contains(keyword.toLowerCase())
            ) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching students found.");
        }
    }
}
