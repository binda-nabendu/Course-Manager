package com.example.demo.component;

import com.example.demo.entity.Course;
import com.example.demo.entity.EducationInfo;
import com.example.demo.entity.User;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class DummyDataLoader implements CommandLineRunner {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // Insert dummy student data
        User user1 = new User("101","John Doe","John","", "Doe", "M", "john@example.com",
                new ArrayList<EducationInfo>(Arrays.asList(
                        new EducationInfo("Vasantech College","HSC", 4.91, 2017),
                        new EducationInfo("North South University","BSC in CSE", 3.91, 2022))),
                new ArrayList<String>(Arrays.asList(
                        "01222323221",
                        "01433567890")), new ArrayList<String>(Arrays.asList("STUDENT")), passwordEncoder.encode("1111"));
        userRepository.save(user1);

        User user2 = new User("818","Lisa Mark alen", "Lisa","Mark", "Alen", "F", "lisaalen@example.com",
                new ArrayList<EducationInfo>(Arrays.asList(
                        new EducationInfo("North South University","BSC in CSE", 3.91, 2016),
                        new EducationInfo("Dhaka University", "MSC in CSE", 3.91, 2018))),
                new ArrayList<String>(Arrays.asList(
                        "0167767566",
                        "01877867546")), new ArrayList<String>(Arrays.asList("STUDENT", "ADMIN")), passwordEncoder.encode("1111"));
        userRepository.save(user1);

        // Insert dummy course data
        Course course1 = new Course("CS101", "Introduction to Computer Science", 3);
        courseRepository.save(course1);

        Course course2 = new Course("ENG101", "English Composition", 4);
        courseRepository.save(course2);
    }
}

