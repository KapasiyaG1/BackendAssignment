package com.kapasiya.backendassignment.repository;

import com.kapasiya.backendassignment.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{
    List<Customer> findByShippingDetails_City(String city);
}
