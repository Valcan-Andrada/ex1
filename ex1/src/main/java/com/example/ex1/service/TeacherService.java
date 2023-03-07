package com.example.ex1.service;

import com.example.ex1.entity.Teacher;
import com.example.ex1.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;
    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }



    public Teacher updateTeacher(Teacher teacher) {
        Teacher t = teacherRepository.save(teacher);
        return t;
    }
}
