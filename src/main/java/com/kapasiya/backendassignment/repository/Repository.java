package com.kapasiya.backendassignment.repository;

import com.kapasiya.backendassignment.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repository extends JpaRepository<Customer,Long>
{
    List<Customer> findByShippingDetailsList_City(String city);
}


