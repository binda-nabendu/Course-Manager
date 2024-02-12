package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "EducationInfo")
public class EducationInfo {
    @Id
    private String id;
    private String instituteName;
    private String degree;
    private double gpa;
    private int passingYear;

    public EducationInfo(String instituteName,String degree, double gpa, int passingYear) {
        this.instituteName = instituteName;
        this.degree = degree;
        this.gpa = gpa;
        this.passingYear = passingYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(int passingYear) {
        this.passingYear = passingYear;
    }
}
