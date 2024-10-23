package com.example.demo.student;

import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get a student by id
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // Create a new student
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // Update a student by id
    public Student updateStudent(Long id, Student updatedStudent) {
        return studentRepository.findById(id).map(student -> {
            student.setFirstName(updatedStudent.getFirstName());
            student.setLastName(updatedStudent.getLastName());
            student.setEmail(updatedStudent.getEmail());
            student.setPhoneNumber(updatedStudent.getPhoneNumber());
            student.setAge(updatedStudent.getAge());
            student.setAddress(updatedStudent.getAddress());
            student.setCity(updatedStudent.getCity());
            student.setCountry(updatedStudent.getCountry());
            student.setUpdatedAt(updatedStudent.getUpdatedAt());
            return studentRepository.save(student);
        }).orElseThrow(() -> new RuntimeException("Student not found with id " + id));
    }

    // Delete a student by id
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
