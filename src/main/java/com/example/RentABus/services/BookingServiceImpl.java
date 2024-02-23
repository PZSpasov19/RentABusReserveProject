package com.example.RentABus.services;

import com.example.RentABus.models.Booking;
import com.example.RentABus.repositories.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
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
