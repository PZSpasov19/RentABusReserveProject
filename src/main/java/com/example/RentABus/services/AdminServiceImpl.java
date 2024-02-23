package com.example.RentABus.services;

import com.example.RentABus.models.Admin;
import com.example.RentABus.repositories.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
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
