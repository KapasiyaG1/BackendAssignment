package com.kapasiya.backendassignment.controller;


import com.kapasiya.backendassignment.model.Customer;
import com.kapasiya.backendassignment.model.PurchaseOrder;
import com.kapasiya.backendassignment.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase-orders")
public class PurchaseOrderController {
    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @PostMapping
    public PurchaseOrder createPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        // Validate pricing against MRP
        if (purchaseOrder.getPricing() > purchaseOrder.getMrp()) {
            throw new IllegalArgumentException("Pricing cannot be greater than MRP");
        }

        return purchaseOrderRepository.save(purchaseOrder);
    }

    @GetMapping
    public List<PurchaseOrder> getAllPurchaseOrders() {
        return purchaseOrderRepository.findAll();
    }

    @GetMapping("/by-customer/{customerId}")
    public List<PurchaseOrder> getPurchaseOrdersByCustomer(@PathVariable Long customerId) {
        Customer customer = new Customer();
        customer.setId(customerId);
        return purchaseOrderRepository.findByCustomer(customer);
    }
}