package com.bae.anprapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import com.bae.anprapi.domain.model.VehicleRegistration;

@Repository
public interface VehicleRegistrationRepository
		extends JpaRepository<VehicleRegistration, Long>, QueryByExampleExecutor<VehicleRegistration> {

	public VehicleRegistration findByVehicleRegistrationNo(String vehicleRegistrationNo);
}