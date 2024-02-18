package com.learning.collegemanagementsystem.service;

import com.learning.collegemanagementsystem.entity.Course;
import com.learning.collegemanagementsystem.entity.Student;
import com.learning.collegemanagementsystem.exception.StudentNotFoundException;

import java.util.Optional;

public interface StudentService {
    Student saveStudentDetails(Student student);
    Student getStudentDetails(Long id) throws StudentNotFoundException;
}
