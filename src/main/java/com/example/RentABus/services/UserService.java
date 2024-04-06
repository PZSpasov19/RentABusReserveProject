package com.example.RentABus.services;

import com.example.RentABus.entities.Users;

import java.util.List;

public interface UserService {
    Users getUserByUsername(String fullName);
    void saveUser(Users user);
    List<Users> getAllUsers();
    Users getById(Long id);
    void deleteUserById(Long id);
}
