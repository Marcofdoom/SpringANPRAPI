package com.bae.anprapi.domain.model;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AnprCameraTest {

	private static AnprCamera anprCamera;

	@BeforeAll
	static void initAll() {
		anprCamera = new AnprCamera(1L, "street name", 1.0F, 1.0F);
	}

	@Test
	void getAnprId() {
		assertTrue(anprCamera.getAnprId() == 1L);
	}

	@Test
	void setAnprId() {
		AnprCamera anprCamera = new AnprCamera();
		anprCamera.setAnprId(2L);
		assertTrue(anprCamera.getAnprId() == 2L);
	}

	@Test
	void getStreetName() {
		assertTrue(anprCamera.getStreetName().contentEquals("street name"));
	}

	@Test
	void setStreetName() {
		AnprCamera anprCamera = new AnprCamera();
		anprCamera.setStreetName("test");
		assertTrue(anprCamera.getStreetName().equals("test"));
	}

	@Test
	void getLatitude() {
		assertTrue(anprCamera.getLatitude() == 1.0F);
	}

	@Test
	void setLatitude() {
		AnprCamera anprCamera = new AnprCamera();
		anprCamera.setLatitude(2F);
		assertTrue(anprCamera.getLatitude() == 2F);
	}

	@Test
	void getLongitude() {
		assertTrue(anprCamera.getLongitude() == 1.0F);
	}

	@Test
	void setLongitude() {
		AnprCamera anprCamera = new AnprCamera();
		anprCamera.setLongitude(2F);
		assertTrue(anprCamera.getLongitude() == 2F);
	}
}