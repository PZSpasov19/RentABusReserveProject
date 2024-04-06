package com.example.RentABus.services;

import com.example.RentABus.entities.BusCompanies;
import com.example.RentABus.repositories.*;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BusServiceImpl implements BusService {
    private final BusRepository busRepository;

    public BusServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public List<BusCompanies> getAllBuses() {
        return busRepository.findAll();
    }

    @Override
    public BusCompanies getBusById(Long id) {
        var bus = busRepository.findById(id);
        if(bus.isPresent())
        {
            return bus.get();
        }
        return null;
    }

    @Override
    public void rentBus(Long id) {
        var bus = busRepository.findById(id);
        if (bus.isPresent()) {
            var getBus = bus.get();
            getBus.setAvailable(false);
            busRepository.save(getBus);
        }
    }


}
