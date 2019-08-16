package com.bae.anprapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.bae.anprapi.model.AnprCamera;

@SpringBootApplication
public class SpringAnprapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAnprapiApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}