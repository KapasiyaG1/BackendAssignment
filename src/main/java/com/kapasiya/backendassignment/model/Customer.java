package com.kapasiya.backendassignment.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerID;

    private String customerName;
    private String email;
    private String mobileNumber;
    private String city;

    @OneToMany(mappedBy = "customer")
    private List<PurchaseOrder> purchaseOrders;

    @OneToMany(mappedBy = "customer")
    private List<ShippingDetails> shipmentDetails;

    public Customer()
    {

    }

    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    public List<ShippingDetails> getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipmentDetails(List<ShippingDetails> shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    public Customer(String customerName, String email, String mobileNumber, String city, List<PurchaseOrder> purchaseOrders, List<ShippingDetails> shipmentDetails) {
        this.customerName = customerName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.city = city;
        this.purchaseOrders = purchaseOrders;
        this.shipmentDetails = shipmentDetails;
    }

    public Customer(String customerName, String email, String mobileNumber, String city)
    {
        this.customerName = customerName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.city = city;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
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
}
