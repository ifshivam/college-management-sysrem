package com.learning.collegemanagementsystem.repository;

import com.learning.collegemanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
