package com.example.RentABus.services;

import com.example.RentABus.models.Booking;

public interface BookingService {
    void saveBooking(Booking booking);

    Object getAllBookings();
}
