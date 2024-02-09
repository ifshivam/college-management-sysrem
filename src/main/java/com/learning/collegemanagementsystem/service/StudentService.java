package com.learning.collegemanagementsystem.service;

import com.learning.collegemanagementsystem.entity.Course;
import com.learning.collegemanagementsystem.entity.Student;

import java.util.Optional;

public interface StudentService {
    Student saveStudentDetails(Student student);
    Optional<Student> getStudentDetails(Long id);
}
