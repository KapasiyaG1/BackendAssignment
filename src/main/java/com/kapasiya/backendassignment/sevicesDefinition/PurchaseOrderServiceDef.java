package com.kapasiya.backendassignment.sevicesDefinition;

import com.kapasiya.backendassignment.model.PurchaseOrder;

import java.util.List;

public interface PurchaseOrderServiceDef
{
    PurchaseOrder createPurchaseOrder(PurchaseOrder purchaseOrder);

    List<PurchaseOrder> getAllPurchaseOrders();

    List<PurchaseOrder> getPurchaseOrdersByCustomerId(Long customerId);
}
