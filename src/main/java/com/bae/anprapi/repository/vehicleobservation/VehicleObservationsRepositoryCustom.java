package com.bae.anprapi.repository.vehicleobservation;

import java.util.List;

import com.bae.anprapi.model.DTO.VehicleObservationsDTO;

public interface VehicleObservationsRepositoryCustom {

	List<VehicleObservationsDTO> getVehicleLocation(String vehicleRegistrationNo);
}