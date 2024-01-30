package com.example.RentABus.Services;

import com.example.RentABus.Models.Booking;
import com.example.RentABus.Repositories.BookingRepository;
import java.util.*;


public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void saveBooking(Booking booking) {
        bookingRepository.saveBooking(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.getAllBookings();
    }


}
