package com.bae.anprapi.domain.model;

import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.Assert.assertTrue;

@ExtendWith(MockitoExtension.class)
public class VehicleObservationsTest {

	private static VehicleObservations vehicleObservations;
	private static AnprCamera anprCamera;
	private static Date date;

	@BeforeAll
	static void initAll() {
		anprCamera = new AnprCamera();
		date = new Date();
		vehicleObservations = new VehicleObservations(anprCamera, "vehicleRegistration", date);
	}

	@Test
	void getAnprPointId() {
		assertTrue(vehicleObservations.getAnprPointId().equals(anprCamera));
	}

	@Test
	void setAnprPointId() {
		VehicleObservations vehicleObservations = new VehicleObservations();
		vehicleObservations.setAnprPointId(anprCamera);
		assertTrue(vehicleObservations.getAnprPointId().equals(anprCamera));
	}

	@Test
	void getVehicleRegistrationNo() {
		assertTrue(vehicleObservations.getVehicleRegistrationNo().equals("vehicleRegistration"));
	}

	@Test
	void setVehicleRegistrationNo() {
		VehicleObservations vehicleObservations = new VehicleObservations();
		vehicleObservations.setVehicleRegistrationNo("vehicleRegistration");
		assertTrue(vehicleObservations.getVehicleRegistrationNo().equals("vehicleRegistration"));
	}

	@Test
	void getTimestamp() {
		assertTrue(vehicleObservations.getTimestamp().equals(date));
	}

	@Test
	void setTimestamp() {
		VehicleObservations vehicleObservations = new VehicleObservations();
		vehicleObservations.setTimestamp(date);
		assertTrue(vehicleObservations.getTimestamp().equals(date));
	}
}