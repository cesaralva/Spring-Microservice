package com.microservice.student.microservice.student.persistence;

import com.microservice.student.microservice.student.entities.Students;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Students,Long> {

    @Query("select s from Students s where s.courseId = :idCourse")
    List<Students> findAllByStudent(Long idCourse);

    //List<Students> findAllByCourseId(Long idCourse);
}
