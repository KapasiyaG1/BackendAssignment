package com.kapasiya.backendassignment.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String email;
    private String mobileNumber;
    private String city;

    @OneToMany(mappedBy = "customer")
    private List<PurchaseOrder> purchaseOrders;

    @OneToMany(mappedBy = "customer")
    private List<ShippingDetails> shippingDetails;

    public Customer(String customerName, String email, String mobileNumber, String city, List<PurchaseOrder> purchaseOrders, List<ShippingDetails> shippingDetails) {
        this.customerName = customerName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.city = city;
        this.purchaseOrders = purchaseOrders;
        this.shippingDetails = shippingDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    public List<ShippingDetails> getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(List<ShippingDetails> shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public Customer()
    {

    }
}
