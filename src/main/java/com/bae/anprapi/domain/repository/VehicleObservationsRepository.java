package com.bae.anprapi.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bae.anprapi.domain.model.VehicleObservations;
import com.bae.anprapi.dto.VehicleObservationsDTO;

@Repository
public interface VehicleObservationsRepository extends JpaRepository<VehicleObservations, Long> {

	@Query("SELECT NEW com.bae.anprapi.dto.VehicleObservationsDTO("
			+ "p.anprPointId.anprId, p.anprPointId.streetName, p.anprPointId.latitude,"
			+ "p.anprPointId.longitude, p.vehicleRegistrationNo,p.timestamp) FROM VehicleObservations p where "
			+ "p.vehicleRegistrationNo = ?1")
	public List<VehicleObservationsDTO> findAllVehicleObservationsByRegistrationNo(String vehicleRegistrationNo);
}