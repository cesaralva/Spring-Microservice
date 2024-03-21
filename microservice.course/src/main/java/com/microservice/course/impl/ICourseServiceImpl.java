package com.microservice.course.impl;

import com.microservice.course.entities.Course;
import com.microservice.course.persistence.ICourseRepository;
import com.microservice.course.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICourseServiceImpl implements ICourseService {
    @Autowired
    private final ICourseRepository iCourseRepository;

    public ICourseServiceImpl(ICourseRepository iCourseRepository) {
        this.iCourseRepository = iCourseRepository;
    }

    @Override
    public List<Course> findAll() {
        return (List<Course>) iCourseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return iCourseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        iCourseRepository.save(course);
    }
}
