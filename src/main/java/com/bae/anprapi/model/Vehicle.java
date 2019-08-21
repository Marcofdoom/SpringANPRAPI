package com.bae.anprapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	private String vehicleRegistrationNo;

	private String make;

	private String model;

	private String colour;

	public Vehicle() {

	}

	public Vehicle(String vehicleRegistrationNo, String make, String model, String colour) {
		this.vehicleRegistrationNo = vehicleRegistrationNo;
		this.make = make;
		this.model = model;
		this.colour = colour;
	}

	public String getVehicleRegistrationNo() {
		return vehicleRegistrationNo;
	}

	public void setVehicleRegistrationNo(String vehicleRegistrationNo) {
		this.vehicleRegistrationNo = vehicleRegistrationNo;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}