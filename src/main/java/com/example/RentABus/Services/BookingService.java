package com.example.RentABus.Services;

import com.example.RentABus.Models.Booking;

public interface BookingService {
    void saveBooking(Booking booking);

    Object getAllBookings();
}
