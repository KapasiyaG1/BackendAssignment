package com.kapasiya.backendassignment.sevicesDefinition;

import com.kapasiya.backendassignment.model.PurchaseOrder;

import java.util.List;
import java.util.Optional;

public interface PurchaseOrderService
{
    PurchaseOrder createPurchaseOrder(PurchaseOrder purchaseOrder);

    List<PurchaseOrder> getAllPurchaseOrders();

    List<PurchaseOrder> getPurchaseOrdersByCustomerId(Long customerId);

    Optional<PurchaseOrder> getPurchaseOrderById(Long purchaseOrderId);
}
