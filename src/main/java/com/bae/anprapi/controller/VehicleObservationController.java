package com.bae.anprapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bae.anprapi.service.VehicleObservationService;

@RestController
@RequestMapping("/ANPR")
public class VehicleObservationController {

	private VehicleObservationService service;

	public VehicleObservationController() {

	}

	@Autowired
	public VehicleObservationController(VehicleObservationService service) {
		this.service = service;
	}

	@GetMapping("/getVehicleLocation")
	public ResponseEntity<Object> getVehicleLocation(
			@RequestParam(value = "vehicleRegistrationNo") String vehicleRegistrationNo) {
		return new ResponseEntity<>(service.getVehicleLocation(vehicleRegistrationNo), HttpStatus.OK);
	}
}