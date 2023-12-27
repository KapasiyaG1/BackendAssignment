package com.kapasiya.backendassignment.model;


import com.kapasiya.backendassignment.model.Customer;
import jakarta.persistence.*;

@Entity
@Table(name = "purchase_orders")
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private int quantity;
    private double pricing;
    private double mrp;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricing() {
        return pricing;
    }

    public void setPricing(double pricing) {
        this.pricing = pricing;
    }

    public double getMrp() {
        return mrp;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public PurchaseOrder()
    {

    }

    public PurchaseOrder(String productName, int quantity, double pricing, double mrp, Customer customer) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricing = pricing;
        this.mrp = mrp;
        this.customer = customer;
    }
}