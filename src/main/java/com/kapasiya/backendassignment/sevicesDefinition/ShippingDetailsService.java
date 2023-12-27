package com.kapasiya.backendassignment.sevicesDefinition;

import com.kapasiya.backendassignment.model.ShippingDetails;

import java.util.List;

public interface ShippingDetailsService
{
    ShippingDetails createShippingDetails(ShippingDetails shippingDetails);

    List<ShippingDetails> getAllShippingDetails();

    List<ShippingDetails> getShippingDetailsByCustomerId(Long customerId);


}
