package com.guru149.bookmyshow.repositories.interfaces;

import java.util.List;

import com.scaler.lld.bookmyshow.models.Booking;
import com.scaler.lld.bookmyshow.models.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> getBookingsByCustomer(Customer customer);
}
