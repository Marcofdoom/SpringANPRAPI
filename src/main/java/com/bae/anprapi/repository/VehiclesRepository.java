package com.bae.anprapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.anprapi.model.Vehicle;

@Repository
public interface VehiclesRepository extends JpaRepository<Vehicle, String> {

}