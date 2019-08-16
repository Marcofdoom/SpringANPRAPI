package com.bae.anprapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Vehicles {

	@Id
	private String vehicleRegistrationNo;

	private String make;

	private String model;

	private String colour;

	public Vehicles() {

	}

	public Vehicles(String vehicleRegistrationNo, String make, String model, String colour) {
		this.vehicleRegistrationNo = vehicleRegistrationNo;
		this.make = make;
		this.model = model;
		this.colour = colour;
	}
}