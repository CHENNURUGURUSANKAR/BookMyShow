package com.guru149.bookmyshow.repositories.interfaces;

import com.scaler.lld.bookmyshow.models.Show;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show, Long> {
}
