package com.example.demo.Repository;

import com.example.demo.Entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}