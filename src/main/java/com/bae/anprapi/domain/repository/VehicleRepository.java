package com.bae.anprapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.anprapi.domain.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

}