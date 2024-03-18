package com.example.RentABus.services;

import com.example.RentABus.entities.BusCompanies;

import java.util.List;

public interface BusService {
    List<BusCompanies> getAllBuses();
    BusCompanies getBusById(Long id);
    void rentBus(Long id);
}
