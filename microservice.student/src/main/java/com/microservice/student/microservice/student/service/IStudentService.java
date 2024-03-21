package com.microservice.student.microservice.student.service;

import com.microservice.student.microservice.student.entities.Students;

import java.util.List;

public interface IStudentService {
    List<Students> findAll();

    Students findById(Long id);

    void save(Students students);

    List<Students> finByIdCourse(Long idCourse);
}
