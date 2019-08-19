package com.bae.anprapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AnprCamera {

	@Id
	private Long anprId;

	private String streetName;

	private Float latitude;

	private Float longitude;

	public AnprCamera() {

	}

	public AnprCamera(Long anprId, String streetName, Float latitude, Float longitude) {
		this.anprId = anprId;
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
	}
}