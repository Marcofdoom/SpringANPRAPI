package com.bae.anprapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.anprapi.model.VehicleRegistration;

@Service
public interface AnprService {

	public List<VehicleRegistration> getANPR(VehicleRegistration vehicleRegistration);
}