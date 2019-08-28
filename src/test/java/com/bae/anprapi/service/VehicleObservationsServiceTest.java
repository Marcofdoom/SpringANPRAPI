package com.bae.anprapi.service;

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

import com.bae.anprapi.domain.dao.VehicleObservationsDAO;
import com.bae.anprapi.dto.VehicleObservationsDTO;

@ExtendWith(MockitoExtension.class)
public class VehicleObservationsServiceTest {

	@InjectMocks
	private VehicleObservationsService vehicleObservationsService;

	@Mock
	private VehicleObservationsDAO vehicleObservationsDAO;

	@Test
	void findAllVehicleObservationsByRegistrationNo() {

		// STATE
		List<VehicleObservationsDTO> vehicleObservationsDTOs = new ArrayList<VehicleObservationsDTO>();
		VehicleObservationsDTO vehicleObservationsDTO1 = new VehicleObservationsDTO(1L, "", 1F, 1F, "", new Date());
		vehicleObservationsDTOs.add(vehicleObservationsDTO1);

		when(vehicleObservationsDAO.findAllVehicleObservationsByRegistrationNo(Mockito.anyString()))
				.thenReturn(vehicleObservationsDTOs);

		// TEST
		List<VehicleObservationsDTO> returnedList = vehicleObservationsService
				.findAllVehicleObservationsByRegistrationNo(Mockito.anyString());

		// VERIFY
		verify(vehicleObservationsDAO, times(1)).findAllVehicleObservationsByRegistrationNo(Mockito.anyString());
		verifyNoMoreInteractions(vehicleObservationsDAO);

		// ASSERT
		assertIterableEquals(vehicleObservationsDTOs, returnedList);
	}
}