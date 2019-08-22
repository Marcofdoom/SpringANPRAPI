package com.bae.anprapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.anprapi.model.VehicleRegistration;
import com.bae.anprapi.model.DTO.VehicleObservationsDTO;

@Service
public interface AnprService {

	public List<VehicleRegistration> getANPR(VehicleRegistration vehicleRegistration);

	public VehicleRegistration getCitizenFromRegistration(String vehicleRegistrationNo);

	public List<VehicleObservationsDTO> getVehicleLocation(String vehicleRegistrationNo);
}