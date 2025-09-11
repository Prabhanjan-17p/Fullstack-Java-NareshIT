package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "Spring_JPA_Day03")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "Name", length = 30)
	@NonNull
	private String name;
	@Column(name = "Department", length = 30)
	@NonNull
	private String department;
	@Column(name = "Salary")
	@NonNull
	private Double salary;
}
