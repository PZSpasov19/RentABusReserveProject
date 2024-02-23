package com.example.RentABus.repositories;

import com.example.RentABus.models.Bus;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BusRepository {
    List<Bus> getAllBuses();
    Bus getBusById(Long id);
    void updateBus(Bus bus);
}
