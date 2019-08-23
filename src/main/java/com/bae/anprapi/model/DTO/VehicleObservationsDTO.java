package com.bae.anprapi.model.DTO;

import java.util.Date;

public class VehicleObservationsDTO {

	private Long anprId;

	private String streetName;

	private Float latitude;

	private Float longitude;

	private String vehicleRegistrationNo;

	private Date timestamp;

	public VehicleObservationsDTO(Long anprId, String streetName, Float latitude, Float longitude,
			String vehicleRegistrationNo, Date timestamp) {
		this.anprId = anprId;
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
		this.vehicleRegistrationNo = vehicleRegistrationNo;
		this.timestamp = timestamp;
	}

	public Long getAnprId() {
		return anprId;
	}

	public void setAnprId(Long anprId) {
		this.anprId = anprId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
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