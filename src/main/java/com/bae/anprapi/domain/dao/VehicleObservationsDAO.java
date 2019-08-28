package com.bae.anprapi.domain.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bae.anprapi.domain.repository.VehicleObservationsRepository;
import com.bae.anprapi.dto.VehicleObservationsDTO;

@Repository
public class VehicleObservationsDAO {

	private VehicleObservationsRepository vehicleObservationRepository;

	@Autowired
	public VehicleObservationsDAO(VehicleObservationsRepository vehicleObservationRepository) {
		this.vehicleObservationRepository = vehicleObservationRepository;
	}

	public List<VehicleObservationsDTO> findAllVehicleObservationsByRegistrationNo(String vehicleRegistrationNo) {
		return vehicleObservationRepository.findAllVehicleObservationsByRegistrationNo(vehicleRegistrationNo);
	};
}