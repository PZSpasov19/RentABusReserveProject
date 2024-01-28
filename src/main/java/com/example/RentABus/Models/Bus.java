package com.example.RentABus.Models;

public class Bus {
    private Long id;
    private String name;
    private boolean available;

    public Bus(Long id, String name, boolean available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
