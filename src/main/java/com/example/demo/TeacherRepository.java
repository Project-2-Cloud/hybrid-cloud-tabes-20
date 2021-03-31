package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface TeacherRepository extends CrudRepository<Teacher, String> {
    Teacher findTeacherById(int id);

    @Transactional
    void deleteTeacherById(int id);
}
