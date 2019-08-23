package com.bae.anprapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.anprapi.model.VehicleRegistration;

@Service
public interface VehicleRegistrationService {

	public VehicleRegistration getCitizenFromRegistration(String vehicleRegistrationNo);

	public List<VehicleRegistration> findVehicleRegistration(VehicleRegistration vehicleRegistration);
}