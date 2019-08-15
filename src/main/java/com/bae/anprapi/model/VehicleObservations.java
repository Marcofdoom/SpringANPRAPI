package com.bae.anprapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class VehicleObservations {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private Long anprPointId;

	private String vehicleRegistrationNumber;

	private Long timeStamp;

	public VehicleObservations() {

	}

	public VehicleObservations(Long anprPointId, String vehicleRegistrationNumber, Long timeStamp) {
		this.anprPointId = anprPointId;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
		this.timeStamp = timeStamp;
	}
}