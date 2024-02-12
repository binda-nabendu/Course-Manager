package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;

@Document(collation = "Students")
public class User {
    @Id
    private String id;
    private String name;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String email;

    private ArrayList<EducationInfo> allEducationInfo;
    private ArrayList<String> roles;
    private ArrayList<String> phones;
    private String password;

    public User(String id, String name, String firstName, String middleName, String lastName, String gender, String email,ArrayList<EducationInfo> allEducationInfo, ArrayList<String> phones, ArrayList<String> roles, String password) {
        this.name = name;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.allEducationInfo = allEducationInfo;
        this.phones = phones;
        this.roles = roles;
        this.password = password;
        this.id = id;
    }


    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<EducationInfo> getAllEducationInfo() {
        return allEducationInfo;
    }

    public void setAllEducationInfo(ArrayList<EducationInfo> allEducationInfo) {
        this.allEducationInfo = allEducationInfo;
    }
}




