package com.kapasiya.backendassignment.sevicesDefinition;

import com.kapasiya.backendassignment.model.Customer;

import java.util.List;

public interface ServicesDef
{
    Customer addCustomer(Customer customer);

    List<Customer> getCustomersByShippingCity(String city);
}
