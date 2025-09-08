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

@Data
@Entity
@Table(name = "Spring_JPA_Day02")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Travel {
	@Id
	private Long id;
	@Column(name = "Destination")
	@NonNull
	private String destination;
	@Column(name = "TransportationMode")
	@NonNull
	private String transportationMode;
	@Column(name = "Price", length = 8)
	@NonNull
	private Double price;
}
