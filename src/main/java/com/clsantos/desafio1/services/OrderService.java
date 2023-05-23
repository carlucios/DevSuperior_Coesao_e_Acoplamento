package com.clsantos.desafio1.services;

import com.clsantos.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private Double totalSum;

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order) {
        totalSum = order.getBasic()*(1-order.getDiscount()/100) +
        shippingService.shipment(order);

        return totalSum;
    }
}
