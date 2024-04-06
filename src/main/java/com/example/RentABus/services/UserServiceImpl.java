package com.example.RentABus.services;

import com.example.RentABus.entities.Users;
import com.example.RentABus.repositories.AdminRepository;
import com.example.RentABus.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    private final UserRepository userRepository;
    private final AdminRepository adminRepository;

    public UserServiceImpl(UserRepository userRepository, AdminRepository adminRepository) {
        this.userRepository = userRepository;
        this.adminRepository = adminRepository;
    }

    @Override
    public Users getUserByUsername(String fullName) {
        return userRepository.findByFullName(fullName);
    }

    @Override
    public void saveUser(Users user) {
        userRepository.save(user);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Users getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var admin = adminRepository.findByEmailAddress(username);
        if (admin != null) {
            return admin;
        }
        return userRepository.findByEmailAddress(username);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
