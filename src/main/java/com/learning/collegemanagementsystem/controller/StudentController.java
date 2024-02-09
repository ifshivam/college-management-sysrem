package com.learning.collegemanagementsystem.controller;

import com.learning.collegemanagementsystem.entity.Student;
import com.learning.collegemanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student){

        return studentService.saveStudentDetails(student);
    }
    @GetMapping("/getStudentById/{id}")
    public Optional<Student> findStudentById(@PathVariable("id") Long studentId){
        return studentService.getStudentDetails(studentId);
    }
}
