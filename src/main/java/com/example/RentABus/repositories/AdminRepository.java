package com.example.RentABus.repositories;

import com.example.RentABus.entities.Admins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public interface AdminRepository extends JpaRepository<Admins, Long> {
    Admins findByEmailAddress(String emailAddress);
}
