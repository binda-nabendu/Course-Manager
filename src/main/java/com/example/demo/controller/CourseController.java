package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CourseController.java
@RestController
@CrossOrigin(origins = "*")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/student/courses")
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @PostMapping("/admin/make-a-course")
    public Course createCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

}
