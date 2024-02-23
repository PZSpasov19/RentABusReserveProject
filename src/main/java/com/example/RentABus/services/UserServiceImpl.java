package com.example.RentABus.services;

import com.example.RentABus.models.User;
import com.example.RentABus.repositories.UserRepository;
import org.springframework.stereotype.Service;


@Service
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
