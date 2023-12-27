package com.kapasiya.backendassignment.controller;


import com.kapasiya.backendassignment.model.Customer;
import com.kapasiya.backendassignment.servicesImp.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
