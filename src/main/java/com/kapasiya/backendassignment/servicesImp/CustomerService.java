package com.kapasiya.backendassignment.servicesImp;

import com.kapasiya.backendassignment.model.Customer;
import com.kapasiya.backendassignment.repository.Repository;
import com.kapasiya.backendassignment.sevicesDefinition.ServicesDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ServicesDef
{
    @Autowired
    private Repository repo;


    @Override
    public Customer addCustomer(Customer customer) {
        return repo.save(customer);
    }
}
