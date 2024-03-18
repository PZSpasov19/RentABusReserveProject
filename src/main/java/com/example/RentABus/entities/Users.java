package com.example.RentABus.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Long id;



    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "emailaddress")
    private String emailAddress;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookingList;

    public Users() {
    }

    public Users(Long id, String password, String fullName, String emailAddress) {
        this.id = id;
        this.password = password;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}