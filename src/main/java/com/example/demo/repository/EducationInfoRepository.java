package com.example.demo.repository;

import com.example.demo.entity.EducationInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationInfoRepository extends MongoRepository<EducationInfo, Long> {
}