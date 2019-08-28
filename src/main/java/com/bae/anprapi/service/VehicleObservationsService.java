package com.bae.anprapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.anprapi.domain.dao.VehicleObservationsDAO;
import com.bae.anprapi.dto.VehicleObservationsDTO;

@Service
public class VehicleObservationsService {

	private VehicleObservationsDAO vehicleObservationsDAO;

	@Autowired
	public VehicleObservationsService(VehicleObservationsDAO vehicleObservationsDAO) {
		this.vehicleObservationsDAO = vehicleObservationsDAO;
	}

	public List<VehicleObservationsDTO> findAllVehicleObservationsByRegistrationNo(String vehicleRegistrationNo) {
		return vehicleObservationsDAO.findAllVehicleObservationsByRegistrationNo(vehicleRegistrationNo);
	};
}