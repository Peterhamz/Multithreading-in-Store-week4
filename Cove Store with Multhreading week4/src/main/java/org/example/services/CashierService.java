package org.example.services;

import org.example.models.CustomerOrder;

import java.util.List;

public interface CashierService {
    void sendOrderToQueue(List<CustomerOrder> orderList);


}
