package com.example.demo.Component;

import com.example.demo.Entity.Course;
import com.example.demo.Entity.Student;
import com.example.demo.Entity.User;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class DummyDataLoader implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // Insert dummy student data
        Student student1 = new Student(1L,"John Doe", "John", "M", "Doe", "Male", "john@example.com");
        studentRepository.save(student1);

        Student student2 = new Student(1L, "Jane Smith", "Jane", "M", "Smith", "Female", "jane@example.com");
        studentRepository.save(student2);

        // Insert dummy course data
        Course course1 = new Course("CS101", "Introduction to Computer Science", 3);
        courseRepository.save(course1);

        Course course2 = new Course("ENG101", "English Composition", 4);
        courseRepository.save(course2);

        User studentUser = new User(1L, "A", passwordEncoder.encode("1111"),"123@gmail.com","STUDENT");
        User teacherUser = new User(1L, "B", passwordEncoder.encode("1111"),"456@gmail.com","TEACHER");

        userRepository.save(studentUser);
        userRepository.save(teacherUser);
    }
}

