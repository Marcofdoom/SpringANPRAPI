package com.bae.anprapi.controller;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.bae.anprapi.domain.model.VehicleRegistration;
import com.bae.anprapi.dto.VehicleObservationsDTO;
import com.bae.anprapi.service.VehicleObservationsService;
import com.bae.anprapi.service.VehicleRegistrationService;

@ExtendWith(MockitoExtension.class)
public class AnprControllerTest {

	@InjectMocks
	private AnprController anprController;

	@Mock
	private VehicleObservationsService vehicleObservationsService;

	@Mock
	private VehicleRegistrationService vehicleRegistrationService;

	@Test
	void findVehicleLocation() {

		// STATE
		List<VehicleObservationsDTO> vehicleObservations = new ArrayList<VehicleObservationsDTO>();
		vehicleObservations.add(new VehicleObservationsDTO(1L, "", 1F, 1F, "", new Date()));

		when(vehicleObservationsService.findAllVehicleObservationsByRegistrationNo(Mockito.anyString()))
				.thenReturn(vehicleObservations);

		// TEST
		ResponseEntity<List<VehicleObservationsDTO>> returnedList = anprController
				.findVehicleLocation(Mockito.anyString());

		// VERIFY
		verify(vehicleObservationsService, times(1)).findAllVehicleObservationsByRegistrationNo(Mockito.anyString());
		verifyNoMoreInteractions(vehicleObservationsService);

		// ASSERT
		assertIterableEquals(vehicleObservations, returnedList.getBody());
	}

	@Test
	void findVehicleRegistrationByIdentity() {

		// STATE
		List<VehicleRegistration> vehicleRegistrations = new ArrayList<VehicleRegistration>();

		when(vehicleRegistrationService.findVehicleRegistrationByIdentity(Mockito.any(VehicleRegistration.class)))
				.thenReturn(vehicleRegistrations);

		// TEST
		ResponseEntity<List<VehicleRegistration>> returnedList = anprController
				.findVehicleRegistrationByIdentity("fornames", "surname", "homeAddress", new Date());

		// VERIFY
		verify(vehicleRegistrationService, times(1))
				.findVehicleRegistrationByIdentity(Mockito.any(VehicleRegistration.class));
		verifyNoMoreInteractions(vehicleObservationsService);

		// ASSERT
		assertIterableEquals(vehicleRegistrations, returnedList.getBody());
	}

	@Test
	void findCitizenByVehicleRegistration() {

		// STATE
		VehicleRegistration vehicleRegistration = new VehicleRegistration();

		when(vehicleRegistrationService.findCitizenByVehicleRegistration(Mockito.anyString()))
				.thenReturn(vehicleRegistration);

		// TEST
		ResponseEntity<VehicleRegistration> vehicleRegistation = anprController
				.findCitizenByVehicleRegistration(Mockito.anyString());

		// VERIFY
		verify(vehicleRegistrationService, times(1)).findCitizenByVehicleRegistration(Mockito.anyString());
		verifyNoMoreInteractions(vehicleRegistrationService);

		// ASSERT
		assertTrue(vehicleRegistation.getBody().equals(vehicleRegistration));
	}
}