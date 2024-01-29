package com.example.RentABus.Repositories;

import com.example.RentABus.Models.User;

public interface UserRepository {
    User getUserByUsername(String username);
    void saveUser(User user);
}
