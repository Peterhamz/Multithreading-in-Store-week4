package org.example.models;

import org.example.Exceptions.OutOfStockException;
import org.example.services.CashierService;
import org.example.services.CustomerService;

import java.io.IOException;
import java.util.List;

public class MyThreading implements Runnable {

    private CustomerOrder customerOrder;

    public MyThreading(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public MyThreading() {
    }



    @Override
    public String toString() {
        return "MyThreading{" +
                "customerOrder=" + customerOrder +
                '}';
    }

    public synchronized void sellProduct() throws IOException {


        List <Product> productList1 = Store.ArrayProductList();
        int i = 0;
        String customerName = customerOrder.getCustomerName();
        String productName = customerOrder.getCustomerPurchase();
        Integer customerQty = customerOrder.getQuantity();
        Double productPrice = 0.0;



            for ( i = 0; i < productList1.size(); i++){
                if (productList1.get(i).getNameOfProduct().equals( productName)) {
                    if (productList1.get(i).getQuantity() < customerQty) {

                        throw new OutOfStockException("OUT OF STOCK!!!");
                    } else if (productList1.get(i).getQuantity() > 0) {

                        productList1.get(i).setQuantity(productList1.get(i).getQuantity() - customerQty);
                        productPrice = productList1.get(i).getPrice();
                    }

                }
            }

            System.out.println("You have successfully purchased " + productName);
            issueReceipt(customerName,productName, productPrice, customerQty);

    }
    public void issueReceipt(String customerName, String nameOfProduct, Double price, Integer quantity) {
        System.out.println("---------------------RECEIPT----------------------");
        System.out.println("Customer's Name: " + customerName);
        System.out.println("Product Name: " + nameOfProduct);
        System.out.println("Unit Price: " + price);
        System.out.println("Total Price: " + price * quantity);
        System.out.println("Quantity purchased: " + quantity );
        System.out.println("Your satisfaction is our satisfaction");
        System.out.println("==================================================");
    }

@Override
    public void run(){

    try {

        sellProduct();
    } catch (IOException e) {
        throw new RuntimeException(e);

    }
}


}
