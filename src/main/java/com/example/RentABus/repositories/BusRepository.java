package com.example.RentABus.repositories;

import com.example.RentABus.entities.BusCompanies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BusRepository extends JpaRepository<BusCompanies, Long> {
}
