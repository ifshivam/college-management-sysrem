//package com.learning.collegemanagementsystem.repository;
//
//import com.learning.collegemanagementsystem.entity.Student;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class StudentRepositoryTest {
//    @Autowired
//    private StudentRepository studentRepository;
//    @Test
//    @Disabled
//    public void saveStudent(){
//      Student student = Student.builder()
//              .email("Shivam@gmail.com")
//              .name("shivam")
//              .gender("male")
//              .build();
//      studentRepository.save(student);
//  }
//}