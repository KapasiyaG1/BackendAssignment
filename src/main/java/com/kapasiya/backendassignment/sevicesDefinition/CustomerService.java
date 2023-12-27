package com.kapasiya.backendassignment.sevicesDefinition;

import com.kapasiya.backendassignment.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService
{
    Customer addCustomer(Customer customer);

    Optional<Customer> getCustomerById(Long customerId);

    List<Customer> getCustomersWithShipmentByCity(String city);

    List<Customer> getCustomersWithPurchaseOrders();

    Optional<Customer> getCustomerWithDetails(Long customerId);
}