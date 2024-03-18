package com.example.RentABus.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "BusCompanies")
public class BusCompanies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "companyid")
    private Long id;

    @Column(name = "companyname")
    private String companyName;

    @Column(name = "contactperson")
    private String contactPerson;

    @Column(name = "contactemail")
    private String contactEmail;

    @Column(name = "contactphone")
    private String contactPhone;

    @Column(name = "isavailable")
    private boolean isAvailable;

    @OneToMany(mappedBy = "busCompany")
    private List<Booking> bookingList;


    public BusCompanies() {
    }

    public BusCompanies(Long id, String companyName, String contactPerson, String contactEmail, String contactPhone, boolean isAvailable) {
        this.id = id;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
