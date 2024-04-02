package com.example.RentABus.repositories;

import com.example.RentABus.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByFullName(String fullName);
    Users findByEmailAddress(String email);
}

