package com.example.RentABus.Models;

import java.time.LocalDate;

public class Booking {
    private Long id;
    private Bus bus;
    private User user;
    private LocalDate startDate;
    private LocalDate endDate;

    public Booking(Long id, Bus bus, User user, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.bus = bus;
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
