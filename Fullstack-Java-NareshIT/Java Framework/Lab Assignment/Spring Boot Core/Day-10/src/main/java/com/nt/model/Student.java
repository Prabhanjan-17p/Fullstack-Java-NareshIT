package com.nt.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Document(collection = "students")
public class Student {
    
    @Id
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String email;   
    @NonNull
    private String course;
    @NonNull
    private Integer marks;
    @NonNull
    private Date enrolledDate;

}
