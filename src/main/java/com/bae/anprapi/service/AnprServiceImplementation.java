package com.bae.anprapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.anprapi.model.VehicleRegistration;
import com.bae.anprapi.repository.VehicleRegistrationRepository;

@Service
public class AnprServiceImplementation implements AnprService {

	private VehicleRegistrationRepository vehicleRegistrationRepository;

	@Autowired
	public AnprServiceImplementation(VehicleRegistrationRepository vehicleRegistrationRepository) {
		this.vehicleRegistrationRepository = vehicleRegistrationRepository;
	}

	@Override
	public List<VehicleRegistration> getANPR(VehicleRegistration vehicleRegistration) {
		return vehicleRegistrationRepository.findANPR(vehicleRegistration.getForenames(),
				vehicleRegistration.getSurname(), vehicleRegistration.getHomeAddress(),
				vehicleRegistration.getDateOfBirth());
	}
}