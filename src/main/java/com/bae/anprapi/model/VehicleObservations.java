package com.bae.anprapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class VehicleObservations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "anpr_point_id")
	private AnprCamera anprPointId;

	private String vehicleRegistrationNo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	public VehicleObservations() {

	}

	public VehicleObservations(AnprCamera anprPointId, String vehicleRegistrationNo, Date timestamp) {
		this.anprPointId = anprPointId;
		this.vehicleRegistrationNo = vehicleRegistrationNo;
		this.timestamp = timestamp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AnprCamera getAnprPointId() {
		return anprPointId;
	}

	public void setAnprPointId(AnprCamera anprPointId) {
		this.anprPointId = anprPointId;
	}

	public String getVehicleRegistrationNo() {
		return vehicleRegistrationNo;
	}

	public void setVehicleRegistrationNo(String vehicleRegistrationNo) {
		this.vehicleRegistrationNo = vehicleRegistrationNo;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}