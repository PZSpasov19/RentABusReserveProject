package com.example.RentABus.repositories;

import com.example.RentABus.models.Booking;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface BookingRepository {
    void saveBooking(Booking booking);
    List<Booking> getAllBookings();
}
