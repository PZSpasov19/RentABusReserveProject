package com.example.RentABus.services;

import com.example.RentABus.entities.Users;
import com.example.RentABus.repositories.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users getUserByUsername(String username) {
        return userRepository.findByFullName(username);
    }

    @Override
    public void saveUser(Users user) {
        userRepository.save(user);
    }
}
