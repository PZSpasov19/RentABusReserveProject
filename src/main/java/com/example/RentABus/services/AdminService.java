package com.example.RentABus.services;

import com.example.RentABus.models.Admin;

public interface AdminService {
    Admin getAdminByUsername(String username);

    Object getAllAdmins();
}

