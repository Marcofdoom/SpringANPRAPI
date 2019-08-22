package com.bae.anprapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.anprapi.model.VehicleObservations;

@Repository
public interface VehicleObservationsRepository extends JpaRepository<VehicleObservations, Long>, VehicleObservationsRepositoryCustom {

}