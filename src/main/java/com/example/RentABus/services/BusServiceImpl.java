package com.example.RentABus.services;

import com.example.RentABus.models.Bus;
import com.example.RentABus.repositories.BusRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BusServiceImpl implements BusService {
    private final BusRepository busRepository;

    public BusServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public List<Bus> getAllBuses() {
        return busRepository.getAllBuses();
    }

    @Override
    public Bus getBusById(Long id) {
        return busRepository.getBusById(id);
    }

    @Override
    public void rentBus(Long id) {
        Bus bus = busRepository.getBusById(id);
        if (bus != null && bus.isAvailable()) {
            bus.setAvailable(false);
            busRepository.updateBus(bus);
        }
    }
}
