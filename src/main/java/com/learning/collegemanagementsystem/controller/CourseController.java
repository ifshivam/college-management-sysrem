package com.learning.collegemanagementsystem.controller;

import com.learning.collegemanagementsystem.entity.Course;
import com.learning.collegemanagementsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;


    @PostMapping("/saveCourse")
    public Course saveCourseDetail(@RequestBody Course course){
        return courseService.saveCourseDetails(course);
    }
    @GetMapping("/getCourseById/{id}")
    public Optional<Course> findCourseById(@PathVariable("id") Long courseId){
        return courseService.getCourseDetails(courseId);
    }
}
