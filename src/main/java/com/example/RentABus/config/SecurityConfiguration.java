package com.example.RentABus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests()
//                .requestMatchers("/CSS/*.css", "/JavaScript/MenuBar.js", "/Images/*.png", "/Images/*.jpg").permitAll()
//                .requestMatchers("*.css", "*.js", "*.png", "*.jpg").permitAll()
//                .requestMatchers("/RegistrationForm").permitAll()
//                .requestMatchers("/login").permitAll()
//                .requestMatchers("/register").anonymous()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/RegistrationForm")
//                .permitAll()
//                .and()
//                .httpBasic();
//    }


    @Bean
    public
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers("/register").permitAll()
                        .requestMatchers("/home").permitAll()
                        .requestMatchers("/js/scripts.js").permitAll()
                        .requestMatchers("/css/*.css", "/js/*.js", "/images/*.png", "/images/*.jpg", "/js/*.zip").permitAll()
                        .anyRequest().authenticated()
                )
                .headers(AbstractHttpConfigurer::disable)
                .formLogin(httpSecurityFormLoginConfigurer -> {
                    httpSecurityFormLoginConfigurer.loginPage("/RegistrationForm").permitAll();
                })
                .httpBasic(withDefaults());
        return http.build();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
