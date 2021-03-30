package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    /*@RequestMapping("/teachers")
    public List<Teacher> getAllTeachers() {
        List <Teacher> teachers = Arrays.asList(
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
        );
        teachers.get(0).addCourseSubject("html");
        teachers.get(0).addCourseSubject("css");
        teachers.get(1).addCourseSubject("python");
        teachers.get(1).addCourseSubject("java");
        teachers.get(2).addCourseSubject("html");
        teachers.get(2).addCourseSubject("css");
        teachers.get(2).addCourseSubject("c++");

        return teachers;
    }*/

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
    public void deleteTeacher(@PathVariable Teacher id) {
        teacherService.deleteTeacher(id);
    }

}
