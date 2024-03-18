package com.example.RentABus.services;

import com.example.RentABus.entities.Users;

public interface UserService {
    Users getUserByUsername(String username);
    void saveUser(Users user);
}
