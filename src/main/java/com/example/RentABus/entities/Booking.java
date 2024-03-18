package com.example.RentABus.entities;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingid")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "userid")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "adminid")
    private Admins admin;

    @ManyToOne
    @JoinColumn(name = "companyid")
    private BusCompanies busCompany;

    @Column(name = "bustype")
    private String busType;

    @Column(name = "departuredate")
    private LocalDate departureDate;

    @Column(name = "returnDate")
    private LocalDate returnDate;

    @Column(name = "totalpassengers")
    private int totalPassengers;

    @Column(name = "totalcost")
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
