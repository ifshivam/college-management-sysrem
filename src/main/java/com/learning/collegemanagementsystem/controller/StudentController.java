package com.learning.collegemanagementsystem.controller;

import com.learning.collegemanagementsystem.entity.Student;
import com.learning.collegemanagementsystem.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
@Tag(name="StudentController", description="Fetch and save student details endPoint ")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Operation(summary="Save Student details for valid Request Body",description = "xyz-abc")
    @ApiResponses({
            @ApiResponse(responseCode = "200",
                    description="save course details"),
            @ApiResponse(responseCode = "400",description = "Request data is not valid/found")
    })

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){

        return studentService.saveStudentDetails(student);
    }
    @Operation(summary="get Student details for valid StudentId",description = "xyz-abc")
    @ApiResponses({
            @ApiResponse(responseCode = "200",
                    description=" fetch student details"),
            @ApiResponse(responseCode = "400",description = "Request data is not valid/found")
    })

    @GetMapping("/getById/{id}")
    public Optional<Student> findStudentById(@PathVariable("id") Long studentId){
        return studentService.getStudentDetails(studentId);
    }
}
