package com.example.RentABus.services;

import com.example.RentABus.models.Bus;

import java.util.List;

public interface BusService {
    List<Bus> getAllBuses();
    Bus getBusById(Long id);
    void rentBus(Long id);
}
