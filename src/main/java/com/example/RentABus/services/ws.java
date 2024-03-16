package com.example.RentABus.services;

import com.example.RentABus.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ws extends JpaRepository<Admin, Long> {
}
