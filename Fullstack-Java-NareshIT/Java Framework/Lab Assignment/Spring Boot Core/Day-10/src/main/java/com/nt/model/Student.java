package com.nt.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "students")
public class Student {
    
    @Id
    private String id;

    private String name;

    private String email;   

    private String course;

    private Integer marks;

    private Date enrolledDate = new Date();

}
