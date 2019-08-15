package com.bae.anprapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Vehicles {

	@Id
	private String vehicleRegistrationNo;

	@Temporal(TemporalType.DATE)
	private Date registrationDate;

	private String make;

	private String model;

	private String colour;

	public Vehicles() {

	}

	public Vehicles(String vehicleRegistrationNo, Date registrationDate, String make, String model, String colour) {
		super();
		this.vehicleRegistrationNo = vehicleRegistrationNo;
		this.registrationDate = registrationDate;
		this.make = make;
		this.model = model;
		this.colour = colour;
	}
}