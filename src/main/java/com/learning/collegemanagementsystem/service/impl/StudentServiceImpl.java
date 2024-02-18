package com.learning.collegemanagementsystem.service.impl;

import com.learning.collegemanagementsystem.entity.Course;
import com.learning.collegemanagementsystem.entity.Student;
import com.learning.collegemanagementsystem.exception.StudentNotFoundException;
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
        // Check if the course ID is provided
        if (course.getId() == null) {
            // Save the new Course first
            course = courseRepository.save(course);
        } else {
            // Retrieve the managed Course entity with the same ID
            course = courseRepository.findById(course.getId()).orElse(null);
        }

        // Associate Student with Course
        student.setEnrolledCourse(course);

        // Save the Student
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentDetails(Long id) throws StudentNotFoundException {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isEmpty())throw new StudentNotFoundException(" student not found for given student id");
        return student.get();
    }
}
