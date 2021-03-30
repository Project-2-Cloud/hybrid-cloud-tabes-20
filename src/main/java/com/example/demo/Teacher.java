package com.example.demo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Teacher {

    @Id
    private String id;

    private String firstName, lastName;
    private int age;
    private String description;
    @ElementCollection
    private List<String> courseSubjects;
    private String image_url;
    private float pricePerHour;

    public Teacher() {

    }

    public Teacher(String id, String firstName, String lastName, int age, String description, String image_url, float pricePerHour) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.courseSubjects =  new ArrayList<>();
        this.description = description;
        this.image_url = image_url;
        this.pricePerHour = pricePerHour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getCourseSubjects() {
        return courseSubjects;
    }

    public void addCourseSubject(String courseSubject) {
        courseSubjects.add(courseSubject);
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
}
