package com.example.RentABus.Services;

import com.example.RentABus.Models.Bus;

import java.util.List;

public interface BusService {
    List<Bus> getAllBuses();
    Bus getBusById(Long id);
    void rentBus(Long id);
}
