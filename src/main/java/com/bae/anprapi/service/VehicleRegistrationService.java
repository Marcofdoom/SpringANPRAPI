package com.bae.anprapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.bae.anprapi.domain.dao.VehicleRegistrationDAO;
import com.bae.anprapi.domain.model.VehicleRegistration;

@Service
public class VehicleRegistrationService {

	private VehicleRegistrationDAO vehicleRegistrationDAO;

	@Autowired
	public VehicleRegistrationService(VehicleRegistrationDAO vehicleRegistrationDAO) {
		this.vehicleRegistrationDAO = vehicleRegistrationDAO;
	}

	public VehicleRegistration findCitizenByVehicleRegistration(String vehicleRegistrationNo) {
		return vehicleRegistrationDAO.findCitizenByVehicleRegistration(vehicleRegistrationNo);
	}

	public List<VehicleRegistration> findVehicleRegistrationByIdentity(VehicleRegistration probe) {
		return vehicleRegistrationDAO
				.findVehicleRegistrationNoByIdentity(Example.of(probe, ExampleMatcher.matchingAll().withIgnoreCase()));
	}
}