package com.bae.anprapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

	private String forenames;

	private String surname;

	private String homeAddress;

	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	private String driverLicenceId;

	public VehicleRegistration() {

	}

	public VehicleRegistration(Long registrationId, String vehicleRegistrationNo, Date registrationDate, String make,
			String model, String colour, String forenames, String surname, String homeAddress, Date dateOfBirth,
			String driverLicenceId) {
		this.registrationId = registrationId;
		this.vehicleRegistrationNo = vehicleRegistrationNo;
		this.registrationDate = registrationDate;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.forenames = forenames;
		this.surname = surname;
		this.homeAddress = homeAddress;
		this.dateOfBirth = dateOfBirth;
		this.driverLicenceId = driverLicenceId;
	}

	public Long getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}

	public String getVehicleRegistrationNo() {
		return vehicleRegistrationNo;
	}

	public void setVehicleRegistrationNo(String vehicleRegistrationNo) {
		this.vehicleRegistrationNo = vehicleRegistrationNo;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
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

	public String getForenames() {
		return forenames;
	}

	public void setForenames(String forenames) {
		this.forenames = forenames;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDriverLicenceId() {
		return driverLicenceId;
	}

	public void setDriverLicenceId(String driverLicenceId) {
		this.driverLicenceId = driverLicenceId;
	}
}