package com.bae.anprapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class VehicleRegistration {

	@Id
	private Long registrationId;

	private String vehicleRegistrationNo;

	@Temporal(TemporalType.DATE)
	private Date registrationDate;

	private String make;

	private String model;

	private String colour;

	private String fornames;

	private String surnames;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	private String driverLicenceId;

	public VehicleRegistration() {

	}

	public VehicleRegistration(Long registrationId, String vehicleRegistrationNo, Date registrationDate,
			String make, String model, String colour, String fornames, String surnames, String address,
			Date dateOfBirth, String driverLicenceId) {
		this.registrationId = registrationId;
		this.vehicleRegistrationNo = vehicleRegistrationNo;
		this.registrationDate = registrationDate;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.fornames = fornames;
		this.surnames = surnames;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.driverLicenceId = driverLicenceId;
	}
}