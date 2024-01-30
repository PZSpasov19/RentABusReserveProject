package com.example.RentABus.Services;

import com.example.RentABus.Models.Admin;
import com.example.RentABus.Repositories.AdminRepository;
import java.util.*;

public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin getAdminByUsername(String username) {
        return adminRepository.getAdminByUsername(username);
    }


    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.getAllAdmins();
    }

    // Additional methods implementation
}
