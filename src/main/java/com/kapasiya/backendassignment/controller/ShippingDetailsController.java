package com.kapasiya.backendassignment.controller;


import com.kapasiya.backendassignment.model.ShippingDetails;
import com.kapasiya.backendassignment.servicesImp.ShippingDetailsServiceImpl;
import com.kapasiya.backendassignment.sevicesDefinition.ShippingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipping-details")
public class ShippingDetailsController {

    private final ShippingDetailsService shippingDetailsService;

    @Autowired
    public ShippingDetailsController(ShippingDetailsService shippingDetailsService) {
        this.shippingDetailsService = shippingDetailsService;
    }

    @PostMapping
    public ShippingDetails createShippingDetails(@RequestBody ShippingDetails shippingDetails) {
        return shippingDetailsService.createShippingDetails(shippingDetails);
    }

    @GetMapping
    public List<ShippingDetails> getAllShippingDetails() {
        return shippingDetailsService.getAllShippingDetails();
    }

    @GetMapping("/by-customer/{customerId}")
    public List<ShippingDetails> getShippingDetailsByCustomerId(@PathVariable Long customerId) {
        return shippingDetailsService.getShippingDetailsByCustomerId(customerId);
    }
}