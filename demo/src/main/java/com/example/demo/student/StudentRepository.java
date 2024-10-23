package com.example.demo.student;

import com.example.demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Additional custom queries can be defined here if needed
}
