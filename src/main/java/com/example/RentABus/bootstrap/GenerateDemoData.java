package com.example.RentABus.bootstrap;

import com.example.RentABus.entities.Admins;
import com.example.RentABus.entities.Users;
import com.example.RentABus.services.AdminService;
import com.example.RentABus.services.UserService;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class GenerateDemoData implements ApplicationListener<ApplicationStartedEvent> {

    private final UserService userService;
    private final AdminService adminService;

    public GenerateDemoData(UserService userService, AdminService adminService) {
        this.userService = userService;
        this.adminService = adminService;
    }

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("********* GENERATING DEMO DATA *************");
        Users user1 = new Users();
        user1.setEmailAddress("t");
        user1.setFullName("Tim Test");
        user1.setPassword("t");
        userService.saveUser(user1);

        Users user2 = new Users();
        user2.setEmailAddress("x");
        user2.setFullName("Unknown");
        user2.setPassword("x");
        userService.saveUser(user2);

        Admins admin1 = new Admins();
        admin1.setFirstName("Darth");
        admin1.setLastName("Vader");
        admin1.setEmailAddress("admin");
        admin1.setPassword("admin");
        adminService.save(admin1);
    }
}
