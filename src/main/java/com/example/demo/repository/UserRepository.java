package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query(value = "{ '_id' : ?0 }", fields = "{ 'roles' : 1 }")
    Optional<ArrayList<String>> findRolesArrayById(String id);
}



