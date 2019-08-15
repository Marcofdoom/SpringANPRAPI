package com.bae.anprapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.anprapi.model.Vehicles;

@Repository
public interface VehiclesRepository extends JpaRepository<Vehicles, Long> {

}