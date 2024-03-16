package com.example.RentABus.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "BusCompanies")
public class BusCompanies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CompanyId")
    private Long id;

    @Column(name = "CompanyName")
    private String companyName;

    @Column(name = "ContactPerson")
    private String contactPerson;

    @Column(name = "ContactEmail")
    private String contactEmail;

    @Column(name = "ContactPhone")
    private String contactPhone;

    public BusCompanies() {
    }

    public BusCompanies(Long id, String companyName, String contactPerson, String contactEmail, String contactPhone) {
        this.id = id;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
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
}
