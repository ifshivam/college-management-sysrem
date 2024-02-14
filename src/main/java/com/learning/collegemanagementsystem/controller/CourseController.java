package com.learning.collegemanagementsystem.controller;

import com.learning.collegemanagementsystem.entity.Course;
import com.learning.collegemanagementsystem.service.CourseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Tag(name="CourseController", description="Fetch and save course details endPoint ")
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;


    @Operation(summary="Save Course details for valid Request Body",description = "xyz-abc")
    @ApiResponses({
            @ApiResponse(responseCode = "200",
            description="save course details"),
            @ApiResponse(responseCode = "400",description = "Request data is not valid/found")
    })
    @PostMapping("/save")
    public Course saveCourseDetail(@RequestBody Course course){
        return courseService.saveCourseDetails(course);
    }
    @Operation(summary="get Course details for valid CourseId",description = "xyz-abc")
    @ApiResponses({
            @ApiResponse(responseCode = "200",
                    description=" fetch course details"),
            @ApiResponse(responseCode = "400",description = "Request data is not valid/found")
    })
    @GetMapping("/getById/{id}")
    public Optional<Course> findCourseById(@PathVariable("id") Long courseId){
        return courseService.getCourseDetails(courseId);
    }

    @Operation(summary="update Course details for valid CourseId",description = "xyz-abc")
    @ApiResponses({
            @ApiResponse(responseCode = "200",
                    description=" fetch course details"),
            @ApiResponse(responseCode = "400",description = "Request data is not valid/found")
    })
    @PutMapping("/updateById/{id}")
    public Optional<Course> findCourseDetailsById(@PathVariable("id") Long courseId,@RequestBody Course course){
        return courseService.updateCourseDetailsById(courseId,course);
    }


}
