package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    private List<Teacher> teachers = new ArrayList<>();

    public void TeacherService() {
        teachers.add(
                new Teacher(
                        "1",
                        "Bram",
                        "Lemeire",
                        20,
                        "good at teaching bla bla",
                        "https://www.dropbox.com/s/swg9bdr0ejcbtrl/img9.jpg?raw=1",
                        15
                ));
        teachers.add(
                new Teacher(
                        "2",
                        "Sander",
                        "Verbeken",
                        21,
                        "good at teaching bla bla",
                        "https://www.dropbox.com/s/6tqcep7rk29l59e/img2.jpeg?raw=1",
                        10
                ));
        teachers.add(
                new Teacher(
                        "3",
                        "Eline",
                        "Schepers",
                        22,
                        "good at teaching bla bla",
                        "https://www.dropbox.com/s/78fot6w894stu3n/img3.jpg?raw=1",
                        17
                ));


        teachers.get(0).addCourseSubject("html");
        teachers.get(0).addCourseSubject("css");
        teachers.get(1).addCourseSubject("python");
        teachers.get(1).addCourseSubject("java");
        teachers.get(2).addCourseSubject("html");
        teachers.get(2).addCourseSubject("css");
        teachers.get(2).addCourseSubject("c++");
    }

    public List<Teacher> getAllTeachers() {
        if(teachers.size()==0){TeacherService();}
        return teachers;
    }

    public Teacher getTeacher(String id) {
        return teacherRepository.findById(id).orElse(null);
    }

    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }
    public void updateTeacher(Teacher teacher)
    {
       teacherRepository.save(teacher);
    }
    public void deleteTeacher(String id)
    {
        teacherRepository.deleteById(id);
    }
}
