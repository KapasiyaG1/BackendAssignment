package com.kapasiya.backendassignment.servicesImp;

import com.kapasiya.backendassignment.model.Customer;
import com.kapasiya.backendassignment.repository.CustomerRepository;
import com.kapasiya.backendassignment.repository.PurchaseOrderRepository;
import com.kapasiya.backendassignment.repository.ShippingDetailsRepository;
import com.kapasiya.backendassignment.sevicesDefinition.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ShippingDetailsRepository shippingDetailsRepository;
    private final PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository,
                               ShippingDetailsRepository shippingDetailsRepository,
                               PurchaseOrderRepository purchaseOrderRepository) {
        this.customerRepository = customerRepository;
        this.shippingDetailsRepository = shippingDetailsRepository;
        this.purchaseOrderRepository = purchaseOrderRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> getCustomerById(Long customerId) {
        return customerRepository.findById(customerId);
    }

    @Override
    public List<Customer> getCustomersWithShipmentByCity(String city) {
        return customerRepository.findByShippingDetails_City(city);
    }

    @Override
    public List<Customer> getCustomersWithPurchaseOrders() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerWithDetails(Long customerId) {
        return customerRepository.findById(customerId);
    }
}