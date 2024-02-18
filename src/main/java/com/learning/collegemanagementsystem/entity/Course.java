package com.learning.collegemanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "course_name")
    @NotBlank(message = "please add course name")
    private String name;
    private String durationInMonth;
    @OneToMany(mappedBy = "enrolledCourse",cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Student> enrolledStudents = new ArrayList<>();;
}
