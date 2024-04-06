package com.example.RentABus;
import com.example.RentABus.controllers.UserController;
import com.example.RentABus.entities.Users;
import com.example.RentABus.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    public void testRegister() throws Exception {
        Users user = new Users();
        user.setFullName("testUser");
        user.setPassword("testPassword");

        doNothing().when(userService).saveUser(user);

        mockMvc.perform(post("/register")
                        .param("username", "testUser")
                        .param("password", "testPassword"))
                .andExpect(status().is3xxRedirection())
                .andExpect(view().name("redirect:/RegistrationForm"));

        verify(userService, times(1)).saveUser(user);
    }
}