package com.example.application.client;

import com.example.application.services.BookingDetails;
import com.example.application.services.FlightService;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.BrowserCallable;

import java.util.List;

@BrowserCallable
@AnonymousAllowed
public class BookingService {
    private final FlightService flightService;

    public BookingService(FlightService flightService) {
        this.flightService = flightService;
    }

    public List<BookingDetails> getBookings() {
        return flightService.getBookings();
    }
}