package com.example.RentABus.Services;

import com.example.RentABus.Models.User;
import com.example.RentABus.Repositories.UserRepository;
import org.springframework.stereotype.Service;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        userRepository.saveUser(user);
    }
}
