package com.example.RentABus.Repositories;

import com.example.RentABus.Models.Admin;

import java.util.*;

public interface AdminRepository {
    Admin getAdminByUsername(String username);
    List<Admin> getAllAdmins();
}
