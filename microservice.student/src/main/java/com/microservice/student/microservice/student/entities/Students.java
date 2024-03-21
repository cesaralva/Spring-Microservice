package com.microservice.student.microservice.student.entities;

import jakarta.persistence.*;
import lombok.*;
@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "student")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastname;
    private String email;


    @Column(name = "course_id")
    private  Long courseId;
}
