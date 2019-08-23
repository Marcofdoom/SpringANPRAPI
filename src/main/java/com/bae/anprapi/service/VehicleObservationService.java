package com.bae.anprapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.anprapi.model.DTO.VehicleObservationsDTO;

@Service
public interface VehicleObservationService {

	public List<VehicleObservationsDTO> getVehicleLocation(String vehicleRegistrationNo);
}