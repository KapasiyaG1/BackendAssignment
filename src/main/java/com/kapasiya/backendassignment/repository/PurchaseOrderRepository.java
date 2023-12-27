package com.kapasiya.backendassignment.repository;

import com.kapasiya.backendassignment.model.Customer;
import com.kapasiya.backendassignment.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long>
{

    List<PurchaseOrder> findByCustomer(Customer customer);
}