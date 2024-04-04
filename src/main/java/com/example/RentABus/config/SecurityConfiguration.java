package com.example.RentABus.config;

import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {


    @Bean
    public H2ConsoleProperties h2ConsoleProperties() {
        H2ConsoleProperties properties = new H2ConsoleProperties();
        properties.setPath("/h2-console");
        properties.setEnabled(true);
        return properties;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable
                )
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers(toH2Console()).permitAll()
                        .requestMatchers("/Home", "/register", "/RegistrationForm").permitAll()

                        .requestMatchers("/CSS/*.css").permitAll()
                        .requestMatchers("/JavaScript/MenuBar.js").permitAll()
                        .requestMatchers("/Images/*.png").permitAll()
                        .requestMatchers("/Images/*.jpg").permitAll()
                        .requestMatchers("*.css", "*.js", "*.png", "*.jpg").permitAll()     // ALLOW NOT REGISTERED USERS TO ACCESS STATIC RESOURCES
                        //.requestMatchers("/lesson/*").permitAll()                                 // ALLOW NOT REGISTERED USERS TO ACCESS ALL LESSONS
                        .requestMatchers("/RegistrationForm").permitAll()
                        .requestMatchers("/login").permitAll()
                        .requestMatchers("/register").anonymous()                                 // ALLOW ONLY UNREGISTERED USERS TO ACCESS REGISTRATION
                        //.requestMatchers("/users/*").hasAuthority("ADMIN")                        // ALLOW ONLY ADMINS TO ACCESS users view
                        .anyRequest().authenticated()
                ).headers(AbstractHttpConfigurer::disable)
                .formLogin(form -> form.loginPage("/RegistrationForm").permitAll())
                //.formLogin(withDefaults())
                .httpBasic(withDefaults());
        return http.build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}