package com.bae.anprapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.anprapi.model.DTO.VehicleObservationsDTO;
import com.bae.anprapi.repository.vehicleobservation.VehicleObservationsRepository;

@Service
public class VehicleObservationServiceImpl implements VehicleObservationService {

	private VehicleObservationsRepository vehicleObservationsRepository;

	@Autowired
	public VehicleObservationServiceImpl(VehicleObservationsRepository vehicleObservationsRepository) {
		this.vehicleObservationsRepository = vehicleObservationsRepository;
	}

	@Override
	public List<VehicleObservationsDTO> getVehicleLocation(String vehicleRegistrationNo) {
		return vehicleObservationsRepository.getVehicleLocation(vehicleRegistrationNo);
	}
}