package com.example.RentABus.services;

import com.example.RentABus.entities.Admins;

public interface AdminService {
    Admins getAdminByUsername(String username);

    Object getAllAdmins();

    void save(Admins admin);
}

