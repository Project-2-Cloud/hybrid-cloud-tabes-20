package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        teacherRepository.findAll()
                .forEach(teachers::add);
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
