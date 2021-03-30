package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> teachers = new ArrayList<>(Arrays.asList(
        new Teacher(
                "1",
                "Bram",
                "Lemeire",
                20,
                "good at teaching bla bla",
                "https://www.dropbox.com/s/swg9bdr0ejcbtrl/img9.jpg?raw=1",
                15
        ),
        new Teacher(
                "2",
                "Sander",
                "Verbeken",
                21,
                "good at teaching bla bla",
                "https://www.dropbox.com/s/6tqcep7rk29l59e/img2.jpeg?raw=1",
                10
        ),
        new Teacher(
                "3",
                "Eline",
                "Schepers",
                22,
                "good at teaching bla bla",
                "https://www.dropbox.com/s/78fot6w894stu3n/img3.jpg?raw=1",
                17
        )
    ));
    
    teachers.get(0).addCourseSubject("html");
    teachers.get(0).addCourseSubject("css");
    teachers.get(1).addCourseSubject("python");
    teachers.get(1).addCourseSubject("java");
    teachers.get(2).addCourseSubject("html");
    teachers.get(2).addCourseSubject("css");
    teachers.get(2).addCourseSubject("c++");


    public List<Teacher> getAllTeachers() {
        return teachers;
    }

}
