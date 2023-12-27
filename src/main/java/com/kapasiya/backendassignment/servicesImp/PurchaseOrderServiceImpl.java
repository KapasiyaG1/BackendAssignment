package com.kapasiya.backendassignment.servicesImp;

import com.kapasiya.backendassignment.model.Customer;
import com.kapasiya.backendassignment.model.PurchaseOrder;
import com.kapasiya.backendassignment.repository.PurchaseOrderRepository;
import com.kapasiya.backendassignment.repository.Repository;
import com.kapasiya.backendassignment.sevicesDefinition.PurchaseOrderServiceDef;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PurchaseOrderServiceImpl implements PurchaseOrderServiceDef
{
    private final PurchaseOrderRepository purchaseOrderRepository;
    private final Repository customerRepository;

    @Autowired
    public PurchaseOrderServiceImpl(
            PurchaseOrderRepository purchaseOrderRepository,
            Repository customerRepository
    ) {
        this.purchaseOrderRepository = purchaseOrderRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public PurchaseOrder createPurchaseOrder(PurchaseOrder purchaseOrder) {
        // Validate pricing against MRP
        if (purchaseOrder.getPricing() > purchaseOrder.getMrp()) {
            throw new IllegalArgumentException("Pricing cannot be greater than MRP");
        }

        return purchaseOrderRepository.save(purchaseOrder);
    }

    @Override
    public List<PurchaseOrder> getAllPurchaseOrders() {
        return purchaseOrderRepository.findAll();
    }

    @Override
    public List<PurchaseOrder> getPurchaseOrdersByCustomerId(Long customerId) {
        // Assuming you have a customer repository to fetch customer details
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid customer ID"));

        return purchaseOrderRepository.findByCustomer(customer);
    }
}