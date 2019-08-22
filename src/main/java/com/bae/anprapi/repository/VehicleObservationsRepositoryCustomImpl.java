package com.bae.anprapi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

import com.bae.anprapi.model.DTO.VehicleObservationsDTO;

public class VehicleObservationsRepositoryCustomImpl implements VehicleObservationsRepositoryCustom {

	private EntityManager entityManager;

	@Autowired
	public VehicleObservationsRepositoryCustomImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<VehicleObservationsDTO> getVehicleLocation(String vehicleRegistrationNo) {

		TypedQuery<VehicleObservationsDTO> query = entityManager
				.createQuery("SELECT NEW com.bae.anprapi.model.DTO.VehicleObservationsDTO("
						+ "p.anprPointId.anprId, p.anprPointId.streetName, p.anprPointId.latitude,"
						+ "p.anprPointId.longitude, p.vehicleRegistrationNo,p.timestamp) FROM VehicleObservations p where "
						+ "p.vehicleRegistrationNo = :vehicleRegistrationNo", VehicleObservationsDTO.class)
				.setParameter("vehicleRegistrationNo", vehicleRegistrationNo);

		return query.getResultList();
	}
}