package com.bae.anprapi.domain.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AnprCamera {

	@Id
	private Long anprId;

	private String streetName;

	private Float latitude;

	private Float longitude;

	@OneToMany(mappedBy = "anprPointId")
	private List<VehicleObservations> vehicleObservations;

	public AnprCamera() {

	}

	public AnprCamera(Long anprId, String streetName, Float latitude, Float longitude) {
		this.anprId = anprId;
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
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
}