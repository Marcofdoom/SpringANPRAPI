package com.bae.anprapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bae.anprapi.model.AnprCamera;

@SpringBootApplication
public class SpringAnprapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAnprapiApplication.class, args);
		
		AnprCamera stuff = new AnprCamera();
	}

}
