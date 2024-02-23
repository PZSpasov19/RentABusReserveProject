package com.example.RentABus.repositories;

import com.example.RentABus.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin getAdminByUsername(String username);
    List<Admin> getAllAdmins();
}
