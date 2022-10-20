package org.example.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerOrder implements Comparator<CustomerOrder> {

    private String customerPurchase;
    private int quantity;
    private  String customerName;

    public CustomerOrder() {
    }

    public CustomerOrder(String customerPurchase, int quantity, String customerName) {
        this.customerPurchase = customerPurchase;
        this.quantity = quantity;
        this.customerName = customerName;
    }


    @Override
    public String toString() {
        return "CustomerOrder{" +
                "customerPurchase='" + customerPurchase + '\'' +
                ", quantity=" + quantity +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public int getQuantity() {

        return quantity;
    }


    public String getCustomerPurchase() {
        return customerPurchase;
    }

    public String getCustomerName() {

        return customerName;
    }

    @Override
    public int compare(CustomerOrder c1, CustomerOrder c2) {

            if (c1.quantity == c2.quantity){
                return 0;
            }
            if (c1.quantity < c2.quantity) {
            return 1;
            } else {
            return -1;
            }
    }
}
