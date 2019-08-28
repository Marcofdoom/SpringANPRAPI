package com.bae.anprapi.domain.dao;

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

import com.bae.anprapi.domain.repository.VehicleObservationsRepository;
import com.bae.anprapi.dto.VehicleObservationsDTO;

@ExtendWith(MockitoExtension.class)
public class VehicleObservationsDAOTest {

	@InjectMocks
	private VehicleObservationsDAO vehicleObservationsDAO;

	@Mock
	private VehicleObservationsRepository vehicleObservationsRepository;

	@Test
	void findAllVehicleObservationsByRegistrationNo() {

		// STATE
		List<VehicleObservationsDTO> vehicleObservationsDTOs = new ArrayList<VehicleObservationsDTO>();
		VehicleObservationsDTO vehicleObservationsDTO1 = new VehicleObservationsDTO(1L, "", 1F, 1F, "", new Date());
		vehicleObservationsDTOs.add(vehicleObservationsDTO1);

		when(vehicleObservationsRepository.findAllVehicleObservationsByRegistrationNo(Mockito.anyString()))
				.thenReturn(vehicleObservationsDTOs);

		// TEST
		List<VehicleObservationsDTO> returnedList = vehicleObservationsDAO
				.findAllVehicleObservationsByRegistrationNo(Mockito.anyString());

		// VERIFY
		verify(vehicleObservationsRepository, times(1)).findAllVehicleObservationsByRegistrationNo(Mockito.anyString());
		verifyNoMoreInteractions(vehicleObservationsRepository);

		// ASSERT
		assertIterableEquals(vehicleObservationsDTOs, returnedList);
	}

}
