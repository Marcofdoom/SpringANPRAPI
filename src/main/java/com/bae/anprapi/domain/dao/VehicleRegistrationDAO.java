package com.bae.anprapi.domain.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import com.bae.anprapi.domain.model.VehicleRegistration;
import com.bae.anprapi.domain.repository.VehicleRegistrationRepository;

@Repository
public class VehicleRegistrationDAO {

	private VehicleRegistrationRepository vehicleRegistrationRepository;

	@Autowired
	public VehicleRegistrationDAO(VehicleRegistrationRepository vehicleRegistrationRepository) {
		this.vehicleRegistrationRepository = vehicleRegistrationRepository;
	}

	public VehicleRegistration findCitizenByVehicleRegistration(String vehicleRegistrationNo) {
		return vehicleRegistrationRepository.findByVehicleRegistrationNo(vehicleRegistrationNo);
	}

	public List<VehicleRegistration> findVehicleRegistrationNoByIdentity(
			Example<VehicleRegistration> vehicleRegistration) {
		return vehicleRegistrationRepository.findAll(vehicleRegistration);
	}
}