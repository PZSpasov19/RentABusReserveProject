package com.example.RentABus.Repositories;

import com.example.RentABus.Models.Bus;

import java.util.List;

public interface BusRepository {
    List<Bus> getAllBuses();
    Bus getBusById(Long id);
    void updateBus(Bus bus);
}
