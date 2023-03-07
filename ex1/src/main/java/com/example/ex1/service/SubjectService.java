package com.example.ex1.service;

import com.example.ex1.entity.Subject;
import com.example.ex1.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;
    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> findAllSubjects() {
        List<Subject> subjectList = subjectRepository.findAll();
        return subjectList;
    }

    public Optional<Subject> findSubjectById(Long id) {
        Optional<Subject> s = subjectRepository.findById(id);
        return s;
    }

    public Subject findSubjectByTitle(String title) {
        return subjectRepository.findSubjectByTitle(title);
    }

    public Subject addSubject(Subject s) {
        return subjectRepository.save(s);
    }


    public void deleteSubject(Long id) {
        subjectRepository.deleteSubjectById(id);
    }

    public Subject updateSubject(Subject s) {
        return subjectRepository.save(s);
    }
}
