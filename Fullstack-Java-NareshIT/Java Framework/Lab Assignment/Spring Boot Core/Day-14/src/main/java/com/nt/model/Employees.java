package com.nt.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Document(collection = "Employees")
@NoArgsConstructor
@AllArgsConstructor
public class Employees {
    @Id
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String department;
    @NonNull
    private double salary;
    @NonNull
    private LocalDate joiningDate;
}
