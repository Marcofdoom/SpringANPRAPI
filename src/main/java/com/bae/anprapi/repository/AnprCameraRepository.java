package com.bae.anprapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.anprapi.model.AnprCamera;

@Repository
public interface AnprCameraRepository extends JpaRepository<AnprCamera, Long> {

}