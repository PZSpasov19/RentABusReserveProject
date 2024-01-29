package com.example.RentABus.Services;

import com.example.RentABus.Models.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User getUserByUsername(String username);
    void saveUser(User user);
}
