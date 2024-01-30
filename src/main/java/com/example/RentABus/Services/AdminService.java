package com.example.RentABus.Services;

import com.example.RentABus.Models.Admin;

public interface AdminService {
    Admin getAdminByUsername(String username);

    Object getAllAdmins();
}

