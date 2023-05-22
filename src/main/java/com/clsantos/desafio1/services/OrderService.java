package com.clsantos.desafio1.services;

public class OrderService {
    private Double totalSum;

    private Double total(Order order) {
        totalSum = order.getBasic()*(1-order.getDiscount()/100) +
        shippingService.shipment(order);

        return totalSum;
    }
}
