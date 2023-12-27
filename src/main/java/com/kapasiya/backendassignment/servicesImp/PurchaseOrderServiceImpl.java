package com.kapasiya.backendassignment.servicesImp;

import com.kapasiya.backendassignment.model.PurchaseOrder;
import com.kapasiya.backendassignment.repository.PurchaseOrderRepository;
import com.kapasiya.backendassignment.sevicesDefinition.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
    @Override
    public List<PurchaseOrder> getPurchaseOrdersByCustomerId(Long customerId) {
        return null;
    }

    private final PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    public PurchaseOrderServiceImpl(PurchaseOrderRepository purchaseOrderRepository) {
        this.purchaseOrderRepository = purchaseOrderRepository;
    }

    @Override
    public PurchaseOrder createPurchaseOrder(PurchaseOrder purchaseOrder) {
        return purchaseOrderRepository.save(purchaseOrder);
    }

    @Override
    public List<PurchaseOrder> getAllPurchaseOrders() {
        return purchaseOrderRepository.findAll();
    }

    @Override
    public Optional<PurchaseOrder> getPurchaseOrderById(Long purchaseOrderId) {
        return purchaseOrderRepository.findById(purchaseOrderId);
    }
}