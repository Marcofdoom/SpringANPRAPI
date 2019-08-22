package com.bae.anprapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.anprapi.model.VehicleRegistration;
import com.bae.anprapi.model.DTO.VehicleObservationsDTO;
import com.bae.anprapi.repository.VehicleObservationsRepository;
import com.bae.anprapi.repository.VehicleRegistrationRepository;

@Service
public class AnprServiceImplementation implements AnprService {

	private VehicleRegistrationRepository vehicleRegistrationRepository;

	private VehicleObservationsRepository vehicleObservationsRepository;

	@Autowired
	public AnprServiceImplementation(VehicleRegistrationRepository vehicleRegistrationRepository,
			VehicleObservationsRepository vehicleObservationsRepository) {
		this.vehicleRegistrationRepository = vehicleRegistrationRepository;
		this.vehicleObservationsRepository = vehicleObservationsRepository;
	}

	@Override
	public List<VehicleRegistration> getANPR(VehicleRegistration vehicleRegistration) {
		return vehicleRegistrationRepository.findANPR(vehicleRegistration.getForenames(),
				vehicleRegistration.getSurname(), vehicleRegistration.getHomeAddress(),
				vehicleRegistration.getDateOfBirth());
	}

	@Override
	public VehicleRegistration getCitizenFromRegistration(String vehicleRegistrationNo) {
		return vehicleRegistrationRepository.findByVehicleRegistrationNo(vehicleRegistrationNo);
	}

	@Override
	public List<VehicleObservationsDTO> getVehicleLocation(String vehicleRegistrationNo) {
		return vehicleObservationsRepository.getVehicleLocation(vehicleRegistrationNo);
	}
}