package com.studentmanagement.util;

import com.studentmanagement.entity.Course;
import com.studentmanagement.entity.Student;

public class InputValidator {

    public static boolean isValidStudent(Student student) {
        return student != null &&
                student.getName() != null &&
                !student.getName().isEmpty() &&
                student.getAge() > 0 &&
                student.getStudentId() != null &&
                !student.getStudentId().isEmpty();
    }

    public static boolean isValidCourse(Course course) {
        return course != null &&
                course.getCourseId() != null &&
                !course.getCourseId().isEmpty() &&
                course.getTitle() != null &&
                !course.getTitle().isEmpty() &&
                course.getCredits() > 0;
    }
}
