package com.bae.anprapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class VehicleObservations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long anprPointId;

	private String vehicleRegistrationNumber;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timeStamp;

	public VehicleObservations() {

	}

	public VehicleObservations(Long anprPointId, String vehicleRegistrationNumber, Date timeStamp) {
		this.anprPointId = anprPointId;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
		this.timeStamp = timeStamp;
	}
}