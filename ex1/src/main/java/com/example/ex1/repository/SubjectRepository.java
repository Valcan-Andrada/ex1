package com.example.ex1.repository;

import com.example.ex1.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Subject findSubjectByTitle(String title);

    void deleteSubjectById(Long id);
}
