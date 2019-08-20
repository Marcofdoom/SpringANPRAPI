package com.bae.anprapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAnprPointId() {
		return anprPointId;
	}

	public void setAnprPointId(Long anprPointId) {
		this.anprPointId = anprPointId;
	}

	public String getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}

	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
}