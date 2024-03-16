package com.example.RentABus.entities;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BookingId")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "AdminId")
    private Admins admin;

    @ManyToOne
    @JoinColumn(name = "CompanyId")
    private BusCompanies busCompany;

    @Column(name = "BusType")
    private String busType;

    @Column(name = "DepartureDate")
    private LocalDate departureDate;

    @Column(name = "ReturnDate")
    private LocalDate returnDate;

    @Column(name = "TotalPassengers")
    private int totalPassengers;

    @Column(name = "TotalCost")
    private double totalCost;

    public Booking() {
    }

    public Booking(Long bookingId, Users user, Admins admin, BusCompanies busCompany, String busType, LocalDate departureDate, LocalDate returnDate, int totalPassengers, double totalCost) {
        this.bookingId = bookingId;
        this.user = user;
        this.admin = admin;
        this.busCompany = busCompany;
        this.busType = busType;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.totalPassengers = totalPassengers;
        this.totalCost = totalCost;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Admins getAdmin() {
        return admin;
    }

    public void setAdmin(Admins admin) {
        this.admin = admin;
    }

    public BusCompanies getBusCompany() {
        return busCompany;
    }

    public void setBusCompany(BusCompanies busCompany) {
        this.busCompany = busCompany;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
