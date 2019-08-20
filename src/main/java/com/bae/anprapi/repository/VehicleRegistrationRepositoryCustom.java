package com.bae.anprapi.repository;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bae.anprapi.model.VehicleRegistration;

@Repository
public interface VehicleRegistrationRepositoryCustom {

	public List<VehicleRegistration> findANPR(String forenames, String surname, String address, Date dateOfBirth);
}