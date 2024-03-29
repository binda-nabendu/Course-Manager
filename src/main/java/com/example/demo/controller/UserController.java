package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") String userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/admin/create-new-user")
    public User createUser(@RequestBody User user) {
        System.out.println(user);
        userRepository.save(user);
        return user;
    }

    @PutMapping("/admin/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") String userId,
                                              @RequestBody User userDetails) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setName(userDetails.getName());
            user.setFirstName(userDetails.getFirstName());
            user.setMiddleName(userDetails.getMiddleName());
            user.setLastName(userDetails.getLastName());
            user.setGender(userDetails.getGender());
            user.setEmail(userDetails.getEmail());
            User updatedUser = userRepository.save(user);
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/admin/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") String userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            userRepository.delete(user.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
