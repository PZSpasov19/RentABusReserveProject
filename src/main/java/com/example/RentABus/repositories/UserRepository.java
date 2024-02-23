package com.example.RentABus.repositories;

import com.example.RentABus.models.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository {
    User getUserByUsername(String username);
    void saveUser(User user);
}
