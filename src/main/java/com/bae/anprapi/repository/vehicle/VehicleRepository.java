package com.bae.anprapi.repository.vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.anprapi.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

}