package com.guru149.bookmyshow.repositories.interfaces;

import com.scaler.lld.bookmyshow.models.Cinema;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}
