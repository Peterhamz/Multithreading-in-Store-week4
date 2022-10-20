package org.example.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.example.models.Cashier.customerToBuy;

class CashierTest {

    @Test
    void sellProduct() throws IOException {
        Cashier cashier = new Cashier();

        boolean ifSold = cashier.sellProduct(customerToBuy);
        Assertions.assertTrue(ifSold);

    }

//    @Test
//    void sendOrderToQueue() {
//        Cashier cashier = new Cashier();
//
//        boolean sendCustomerOrders = cashier.sendOrderToQueue(customerOrders);
//    }
}