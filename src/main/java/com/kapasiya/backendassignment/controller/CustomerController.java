package com.kapasiya.backendassignment.controller;


import com.kapasiya.backendassignment.model.Customer;
import com.kapasiya.backendassignment.servicesImp.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController
{
    @Autowired
    CustomerService service;

    public Customer addCustomer(@RequestBody Customer customer)
    {
        return service.addCustomer(customer);
    }

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.service = customerService;
    }

    @GetMapping("/by-shipping-city")
    public List<Customer> getCustomersByShippingCity(@RequestParam String city) {
        return service.getCustomersByShippingCity(city);
    }

    @GetMapping("/with-purchase-orders")
    public List<Customer> getCustomersWithPurchaseOrders() {
        return service.getCustomersWithPurchaseOrders();
    }
}
