package com.learning.collegemanagementsystem.service.impl;

import com.learning.collegemanagementsystem.entity.Course;
import com.learning.collegemanagementsystem.entity.Student;
import com.learning.collegemanagementsystem.repository.CourseRepository;
import com.learning.collegemanagementsystem.repository.StudentRepository;
import com.learning.collegemanagementsystem.service.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Override
    @Transactional
    public Student saveStudentDetails(Student student){
        Course course = student.getEnrolledCourse();

        // Check if the course is already saved or needs to be saved
        if (course.getId() == null) {
            // Save the Course first
            course = courseRepository.save(course);
        }

        // Associate Student with Course
        student.setEnrolledCourse(course);

        // Save the Student
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentDetails(Long id) {
        return studentRepository.findById(id);
    }
}
