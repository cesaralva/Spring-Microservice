package com.microservice.student.microservice.student.impl;

import com.microservice.student.microservice.student.entities.Students;
import com.microservice.student.microservice.student.persistence.StudentRepository;
import com.microservice.student.microservice.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Students> findAll() {
        return (List<Students>) studentRepository.findAll();
    }

    @Override
    public Students findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Students students) {
        studentRepository.save(students);
    }

    @Override
    public List<Students> finByIdCourse(Long idCourse) {
        return null;
    }
}
