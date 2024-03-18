package com.example.RentABus.repositories;

import com.example.RentABus.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
