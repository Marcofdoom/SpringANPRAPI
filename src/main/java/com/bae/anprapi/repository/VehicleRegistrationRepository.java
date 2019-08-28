package com.bae.anprapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.anprapi.model.VehicleRegistration;

@Repository
public interface VehicleRegistrationRepository
		extends JpaRepository<VehicleRegistration, Long>, VehicleRegistrationRepositoryCustom {
}