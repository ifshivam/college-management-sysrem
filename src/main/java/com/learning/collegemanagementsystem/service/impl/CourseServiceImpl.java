package com.learning.collegemanagementsystem.service.impl;

import com.learning.collegemanagementsystem.entity.Course;
import com.learning.collegemanagementsystem.repository.CourseRepository;
import com.learning.collegemanagementsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course saveCourseDetails(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Optional<Course> getCourseDetails(Long id) {
        return courseRepository.findById(id);
    }
}
