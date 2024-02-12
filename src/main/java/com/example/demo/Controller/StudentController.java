package com.example.demo.Controller;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// StudentController.java
@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Long studentId) {
        Optional<Student> student = studentRepository.findById(studentId);
        if (student.isPresent()) {
            return ResponseEntity.ok().body(student.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable(value = "id") Long studentId,
                                                 @RequestBody Student studentDetails) {
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setName(studentDetails.getName());
            student.setFirstName(studentDetails.getFirstName());
            student.setMiddleName(studentDetails.getMiddleName());
            student.setLastName(studentDetails.getLastName());
            student.setGender(studentDetails.getGender());
            student.setEmail(studentDetails.getEmail());
            Student updatedStudent = studentRepository.save(student);
            return ResponseEntity.ok(updatedStudent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable(value = "id") Long studentId) {
        Optional<Student> student = studentRepository.findById(studentId);
        if (student.isPresent()) {
            studentRepository.delete(student.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
