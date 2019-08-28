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

import com.bae.anprapi.domain.model.VehicleRegistration;
import com.bae.anprapi.service.VehicleObservationsService;
import com.bae.anprapi.service.VehicleRegistrationService;

@RestController
@RequestMapping("/anpr")
public class AnprController {

	private VehicleObservationsService vehicleObservationsService;

	private VehicleRegistrationService vehicleRegistrationService;

	@Autowired
	public AnprController(VehicleObservationsService vehicleObservationsService,
			VehicleRegistrationService vehicleRegistrationService) {
		this.vehicleObservationsService = vehicleObservationsService;
		this.vehicleRegistrationService = vehicleRegistrationService;
	}

	@GetMapping("/find-all-vehicle-locations")
	public ResponseEntity<Object> findVehicleLocation(
			@RequestParam(value = "vehicle-registration-no") String vehicleRegistrationNo) {
		return new ResponseEntity<>(
				vehicleObservationsService.findAllVehicleObservationsByRegistrationNo(vehicleRegistrationNo),
				HttpStatus.OK);
	}

	@GetMapping("/find-vehicle-registration")
	public ResponseEntity<Object> findVehicleRegistrationByIdentity(@RequestParam(value = "forenames") String forenames,
			@RequestParam(value = "surname") String surname, @RequestParam(value = "home-address") String homeAddress,
			@RequestParam(value = "date-of-birth") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateOfBirth) {

		VehicleRegistration vehicleRegistration = new VehicleRegistration();

		vehicleRegistration.setForenames(forenames);
		vehicleRegistration.setSurname(surname);
		vehicleRegistration.setHomeAddress(homeAddress);
		vehicleRegistration.setDateOfBirth(dateOfBirth);

		return new ResponseEntity<>(vehicleRegistrationService.findVehicleRegistrationByIdentity(vehicleRegistration),
				HttpStatus.OK);
	}

	@GetMapping("/find-citizen-by-registration")
	public ResponseEntity<Object> findCitizenByVehicleRegistration(
			@RequestParam(value = "vehicle-registration-no") String vehicleRegistrationNo) {
		return new ResponseEntity<>(vehicleRegistrationService.findCitizenByVehicleRegistration(vehicleRegistrationNo),
				HttpStatus.OK);
	}
}