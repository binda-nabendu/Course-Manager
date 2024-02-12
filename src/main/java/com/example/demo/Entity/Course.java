package com.example.demo.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String courseCode;
    private String title;
    private int credits;

    public Course(String id, String courseCode, String title, int credits) {
        this.courseCode = id;
        this.title = title;
        this.credits = credits;
    }
    public Course(String courseCode, String title, int credits) {
        this.courseCode = courseCode;
        this.courseCode = courseCode;
        this.title = title;
        this.credits = credits;
    }

    public Course() {

    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
