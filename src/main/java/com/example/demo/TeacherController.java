package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    

    @RequestMapping("/teachers")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @RequestMapping("/teachers/{id}")
    public Teacher getTeacher(@PathVariable String id){
        return teacherService.getTeacher(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/teachers")
    public void addTeacher(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/teachers/{id}")
    public void updateTeacher(@RequestBody Teacher teacher, @PathVariable String id) {
        teacherService.updateTeacher(id, teacher);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/teachers/{id}")
    public void deleteTeacher(@PathVariable String id) {
        teacherService.deleteTeacher(id);
    }

}
