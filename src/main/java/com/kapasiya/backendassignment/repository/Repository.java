package com.kapasiya.backendassignment.repository;

import com.kapasiya.backendassignment.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Customer,Long>
{

}


