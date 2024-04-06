package com.example.RentABus.services;

import com.example.RentABus.entities.Admins;
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
    public Admins getAdminByUsername(String username) {
        return adminRepository.findByEmailAddress(username);
    }


    @Override
    public List<Admins> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public void save(Admins admin) {
        adminRepository.save(admin);
    }
}
