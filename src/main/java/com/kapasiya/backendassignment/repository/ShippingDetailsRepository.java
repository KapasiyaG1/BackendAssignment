package com.kapasiya.backendassignment.repository;

import com.kapasiya.backendassignment.model.Customer;
import com.kapasiya.backendassignment.model.ShippingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShippingDetailsRepository extends JpaRepository<ShippingDetails, Long>
{
    List<ShippingDetails> findByCustomer(Customer customer);
}
