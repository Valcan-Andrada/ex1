package com.example.ex1.controller;

import com.example.ex1.entity.Teacher;
import com.example.ex1.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }




    @PostMapping("add")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        Teacher t = teacherService.addTeacher(teacher);
        return  t;
    }
    @PutMapping("update")
    public ResponseEntity<Teacher> updateTeacherById(@RequestBody Teacher teacher){
        Teacher t = teacherService.updateTeacher(teacher);
        return  new ResponseEntity<>(t, HttpStatus.OK);
    }
}
