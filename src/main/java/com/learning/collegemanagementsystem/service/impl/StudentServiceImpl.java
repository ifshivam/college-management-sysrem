package com.learning.collegemanagementsystem.service.impl;

import com.learning.collegemanagementsystem.entity.Student;
import com.learning.collegemanagementsystem.repository.StudentRepository;
import com.learning.collegemanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudentDetails(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentDetails(Long id) {
        return studentRepository.findById(id);
    }
}
