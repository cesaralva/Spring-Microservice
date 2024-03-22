package com.microservice.course.controllers.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDTO {

    private String name;
    private String lastname;
    private String email;
    private  Long courseId;
}
