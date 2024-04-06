package com.example.RentABus;

import com.example.RentABus.controllers.BookingController;
import com.example.RentABus.entities.Booking;
import com.example.RentABus.services.BookingService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class BookingControllerTest {

    @InjectMocks
    private BookingController bookingController;

    @Mock
    private BookingService bookingService;

    @Test
    public void testBookingFormSubmission() {
        Booking booking = new Booking();

        doNothing().when(bookingService).saveBooking(any(Booking.class));

        String result = bookingController.bookBus(booking);

        verify(bookingService, times(1)).saveBooking(booking);

        assertEquals("redirect:/companies", result);
    }

}
