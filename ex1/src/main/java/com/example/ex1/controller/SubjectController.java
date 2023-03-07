package com.example.ex1.controller;

import com.example.ex1.entity.Subject;
import com.example.ex1.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    private final SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }




    @GetMapping("/all")
    public List<Subject> getSubjects(){
        List<Subject> subjects = subjectService.findAllSubjects();
        return subjects;
    }

    @GetMapping("/find/{id}")
    public Optional<Subject> findSubjectById(@PathVariable Long id){
        Optional<Subject> s = subjectService.findSubjectById(id);
        return s;
    }
    @GetMapping("/find/{title}")
    public Subject findSubjectByTitle(@PathVariable String title){
        Subject s = subjectService.findSubjectByTitle(title);
        return  s;
    }
    @PostMapping("/add")
    public Subject addSubject(@RequestBody Subject s){
        Subject newSubject = subjectService.addSubject(s);
        return newSubject;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSubject(@PathVariable Long id){
        subjectService.deleteSubject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Subject> updateSubject(@RequestBody Subject s){
        Subject updateSubject = subjectService.updateSubject(s);
        return new ResponseEntity<>(updateSubject,HttpStatus.OK);
    }
}
