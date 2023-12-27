package com.kapasiya.backendassignment.servicesImp;

import com.kapasiya.backendassignment.model.Customer;
import com.kapasiya.backendassignment.repository.Repository;
import com.kapasiya.backendassignment.sevicesDefinition.ServicesDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ServicesDef
{
    @Autowired
    private Repository repo;

    @Autowired
    public CustomerService(Repository customerRepository) {
        this.repo = customerRepository;
    }


    @Override
    public Customer addCustomer(Customer customer) {
        return repo.save(customer);
    }


    @Override
    public List<Customer> getCustomersByShippingCity(String city) {
        return repo.findByShippingDetailsList_City(city);
    }

    @Override
    public List<Customer> getCustomersWithPurchaseOrders() {
        return repo.findAll();
    }
}
