package com.example.application.data;

import java.time.LocalDate;

public class Booking {

    private String bookingNumber;
    private LocalDate date;
    private Customer customer;

    private BookingStatus bookingStatus;
    private InsuranceClass insuranceClass;

    public Booking(String bookingNumber, LocalDate date, Customer customer, BookingStatus bookingStatus, InsuranceClass insuranceClass) {
        this.bookingNumber = bookingNumber;
        this.date = date;
        this.customer = customer;
        this.bookingStatus = bookingStatus;

        this.insuranceClass = insuranceClass;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }



    public InsuranceClass getBookingClass() {
        return insuranceClass;
    }

    public void setBookingClass(InsuranceClass insuranceClass) {
        this.insuranceClass = insuranceClass;
    }
}