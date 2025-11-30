package com.studentmanagement.interfaces;

import com.studentmanagement.entity.Student;
import com.studentmanagement.exception.StudentNotFoundException;

public interface Searchable {
    Student searchStudent(String studentId) throws StudentNotFoundException;
}
