package com.kapasiya.backendassignment.servicesImp;

import com.kapasiya.backendassignment.model.Customer;
import com.kapasiya.backendassignment.model.ShippingDetails;
import com.kapasiya.backendassignment.repository.Repository;
import com.kapasiya.backendassignment.repository.ShippingDetailsRepository;
import com.kapasiya.backendassignment.sevicesDefinition.ShippingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShippingDetailsServiceImpl implements ShippingDetailsService
{

    private final ShippingDetailsRepository shippingDetailsRepository;
    private final Repository customerRepository;

    @Autowired
    public ShippingDetailsServiceImpl(ShippingDetailsRepository shippingDetailsRepository,Repository customerRepository) {
        this.shippingDetailsRepository = shippingDetailsRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public ShippingDetails createShippingDetails(ShippingDetails shippingDetails) {
        return shippingDetailsRepository.save(shippingDetails);
    }

    @Override
    public List<ShippingDetails> getAllShippingDetails() {
        return shippingDetailsRepository.findAll();
    }

    @Override
    public List<ShippingDetails> getShippingDetailsByCustomerId(Long customerId)
    {
        Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new IllegalArgumentException("Invalid customer ID"));
        return shippingDetailsRepository.findByCustomer(customer);
    }

}