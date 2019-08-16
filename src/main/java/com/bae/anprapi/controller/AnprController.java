package com.bae.anprapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}