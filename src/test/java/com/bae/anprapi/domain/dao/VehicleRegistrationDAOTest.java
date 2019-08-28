package com.bae.anprapi.domain.dao;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import com.bae.anprapi.domain.model.VehicleRegistration;
import com.bae.anprapi.domain.repository.VehicleRegistrationRepository;

@ExtendWith(MockitoExtension.class)
public class VehicleRegistrationDAOTest {

	@InjectMocks
	private VehicleRegistrationDAO vehicleRegistrationDAO;

	@Mock
	private VehicleRegistrationRepository vehicleRegistrationRepository;

	@Test
	void findCitizenByVehicleRegistration() {

		// STATE
		VehicleRegistration vehicleRegistration = new VehicleRegistration();

		when(vehicleRegistrationRepository.findByVehicleRegistrationNo(Mockito.anyString()))
				.thenReturn(vehicleRegistration);

		// TEST
		VehicleRegistration returnedTestObject = vehicleRegistrationDAO
				.findCitizenByVehicleRegistration(Mockito.anyString());

		// VERIFY
		verify(vehicleRegistrationRepository, times(1)).findByVehicleRegistrationNo(Mockito.anyString());
		verifyNoMoreInteractions(vehicleRegistrationRepository);

		// ASSERT
		assertTrue(vehicleRegistration.equals(returnedTestObject));
	}

	@Test
	void findVehicleRegistrationNoByIdentity() {

		// STATE
		List<VehicleRegistration> vehicleRegistrations = new ArrayList<VehicleRegistration>();

		Example<VehicleRegistration> probe = Example.of(new VehicleRegistration(),
				ExampleMatcher.matching().withIgnoreCase());
		when(vehicleRegistrationRepository.findAll(probe)).thenReturn(vehicleRegistrations);

		// TEST
		List<VehicleRegistration> returnedList = vehicleRegistrationDAO.findVehicleRegistrationNoByIdentity(probe);

		// VERIFY
		verify(vehicleRegistrationRepository, times(1)).findAll(probe);
		verifyNoMoreInteractions(vehicleRegistrationRepository);

		// ASSERT
		assertIterableEquals(vehicleRegistrations, returnedList);
	}
}