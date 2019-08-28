package com.bae.anprapi.service;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bae.anprapi.domain.dao.VehicleRegistrationDAO;
import com.bae.anprapi.domain.model.VehicleRegistration;

@ExtendWith(MockitoExtension.class)
public class VehicleRegistrationServiceTest {

	@InjectMocks
	private VehicleRegistrationService vehicleRegistrationService;

	@Mock
	private VehicleRegistrationDAO vehicleRegistrationDAO;

	@Test
	void findCitizenByVehicleRegistration() {

		// STATE
		VehicleRegistration vehicleRegistration = new VehicleRegistration();

		when(vehicleRegistrationDAO.findCitizenByVehicleRegistration(Mockito.anyString()))
				.thenReturn(vehicleRegistration);

		// TEST
		VehicleRegistration returnedObject = vehicleRegistrationService
				.findCitizenByVehicleRegistration(Mockito.anyString());

		// VERIFY
		verify(vehicleRegistrationDAO, times(1)).findCitizenByVehicleRegistration(Mockito.anyString());
		verifyNoMoreInteractions(vehicleRegistrationDAO);

		// ASSERT
		assertTrue(vehicleRegistration.equals(returnedObject));

	}

	@Test
	void findVehicleRegistrationByIdentity() {

		// STATE
		List<VehicleRegistration> vehicleRegistrations = new ArrayList<VehicleRegistration>();

		when(vehicleRegistrationDAO.findVehicleRegistrationNoByIdentity(Mockito.any()))
				.thenReturn(vehicleRegistrations);

		// TEST
		List<VehicleRegistration> returnedList = vehicleRegistrationService
				.findVehicleRegistrationByIdentity(new VehicleRegistration());

		// VERIFY
		verify(vehicleRegistrationDAO, times(1)).findVehicleRegistrationNoByIdentity(Mockito.any());
		verifyNoMoreInteractions(vehicleRegistrationDAO);

		// ASSERT
		assertIterableEquals(vehicleRegistrations, returnedList);
	}
}
