package com.example.RentABus.services;

import com.example.RentABus.models.User;

public interface UserService {
    User getUserByUsername(String username);
    void saveUser(User user);
}
