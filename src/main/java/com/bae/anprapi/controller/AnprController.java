package com.bae.anprapi.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bae.anprapi.model.VehicleRegistration;
import com.bae.anprapi.service.AnprService;

@RestController
@RequestMapping("/ANPR")
public class AnprController {

	private AnprService service;

	public AnprController() {

	}

	@Autowired
	public AnprController(AnprService service) {
		this.service = service;
	}

	@GetMapping("/getANPR")
	public ResponseEntity<Object> getANPR(@RequestParam(value = "forenames", required = false) String forenames,
			@RequestParam(value = "surname", required = false) String surname,
			@RequestParam(value = "homeAddress", required = false) String homeAddress,
			@RequestParam(value = "dateOfBirth", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateOfBirth) {

		VehicleRegistration vehicleRegistration = new VehicleRegistration();

		vehicleRegistration.setForenames(forenames);
		vehicleRegistration.setSurname(surname);
		vehicleRegistration.setHomeAddress(homeAddress);
		vehicleRegistration.setDateOfBirth(dateOfBirth);

		return new ResponseEntity<>(service.getANPR(vehicleRegistration), HttpStatus.OK);
	}
}