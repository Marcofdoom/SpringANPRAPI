package com.bae.anprapi.repository.vehicleobservation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

import com.bae.anprapi.model.DTO.VehicleObservationsDTO;

public class VehicleObservationsRepositoryCustomImpl implements VehicleObservationsRepositoryCustom {

	private String vehicleObservationQuery = "SELECT NEW com.bae.anprapi.model.DTO.VehicleObservationsDTO("
			+ "p.anprPointId.anprId, p.anprPointId.streetName, p.anprPointId.latitude,"
			+ "p.anprPointId.longitude, p.vehicleRegistrationNo,p.timestamp) FROM VehicleObservations p where "
			+ "p.vehicleRegistrationNo = :vehicleRegistrationNo";

	private EntityManager entityManager;

	@Autowired
	public VehicleObservationsRepositoryCustomImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<VehicleObservationsDTO> getVehicleLocation(String vehicleRegistrationNo) {
		return entityManager.createQuery(vehicleObservationQuery, VehicleObservationsDTO.class)
				.setParameter("vehicleRegistrationNo", vehicleRegistrationNo).getResultList();
	}
}