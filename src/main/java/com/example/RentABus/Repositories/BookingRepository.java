package com.example.RentABus.Repositories;

import com.example.RentABus.Models.Booking;

import java.util.*;

public interface BookingRepository {
    void saveBooking(Booking booking);
    List<Booking> getAllBookings();
}
