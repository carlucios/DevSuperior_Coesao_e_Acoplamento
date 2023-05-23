package com.clsantos.desafio1.services;

import com.clsantos.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    private double orderBasic;

    public double shipment(Order order) {
        orderBasic = order.getBasic();

        if (orderBasic >= 200.0) {
            return 0.0;
        } else if (orderBasic < 100.0) {
            return 20.0;
        } else {
            return 12.0;
        }
    }
}
