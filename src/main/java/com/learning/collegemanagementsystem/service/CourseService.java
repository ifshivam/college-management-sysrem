package com.learning.collegemanagementsystem.service;

import com.learning.collegemanagementsystem.entity.Course;

import java.util.Optional;

public interface CourseService {
    Course saveCourseDetails(Course course);
    Optional<Course> getCourseDetails(Long id);

    Optional<Course> updateCourseDetailsById(Long id,Course course);
}
