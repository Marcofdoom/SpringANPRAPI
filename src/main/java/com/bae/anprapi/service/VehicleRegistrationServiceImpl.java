package com.bae.anprapi.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.bae.anprapi.model.VehicleRegistration;
import com.bae.anprapi.repository.vehicleregistration.VehicleRegistrationRepository;

@Service
public class VehicleRegistrationServiceImpl implements VehicleRegistrationService {

	private VehicleRegistrationRepository repository;

	public VehicleRegistrationServiceImpl(VehicleRegistrationRepository repository) {
		this.repository = repository;
	}

	@Override
	public VehicleRegistration getCitizenFromRegistration(String vehicleRegistrationNo) {
		return repository.findByVehicleRegistrationNo(vehicleRegistrationNo);
	}

	@Override
	public List<VehicleRegistration> findVehicleRegistration(VehicleRegistration probe) {
		return repository.findAll(Example.of(probe, ExampleMatcher.matchingAll().withIgnoreCase()));
	}
}