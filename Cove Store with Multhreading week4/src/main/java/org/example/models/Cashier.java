package org.example.models;

import org.example.Exceptions.OutOfStockException;
import org.example.services.CashierService;

import java.io.IOException;
import java.util.*;

public class Cashier extends Staff implements CashierService {

    public Cashier() {

        super();
    }

   public static List<CustomerOrder> customerToBuy = new ArrayList<>();

    public Cashier(String id, String name, String phoneNumber, String qualification, Integer age, Address address) {
        super(id, name,phoneNumber, qualification, age, address);
    }

    private void attendToCustomer(){
    }

    public static boolean sellProduct(List<CustomerOrder> productsToBuy) throws IOException{


        List <Product> productList1 = Store.ArrayProductList();
        int j = 0;
        int i = 0;
        String customerName = "";
        String productName = "";
        Integer customerQty = 0;
        Double productPrice = 0.0;




        while (!(j >= productsToBuy.size())) {
            customerName = productsToBuy.get(j).getCustomerName();
            productName = productsToBuy.get(j).getCustomerPurchase();
            customerQty = productsToBuy.get(j).getQuantity();
            j++;

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


        return true;
    }

    public static void issueReceipt(String customerName, String nameOfProduct, Double price, Integer quantity) {
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
    public void sendOrderToQueue(List<CustomerOrder> orderList) {
       //
        Set<Integer> customerOrderSet = new HashSet<>();

       //FIFO
        Queue<CustomerOrder> customerName = new LinkedList<>();

      //PRIORITY QUEUE
        PriorityQueue<CustomerOrder> customerOrderPriorityQueue = new PriorityQueue<>(new CustomerOrder());


        for (CustomerOrder customerOrder : orderList) {
            customerOrderSet.add(customerOrder.getQuantity());
            customerName.add(customerOrder);

        }
        if (customerOrderSet.size() == 1){
            System.out.println("\t  FIFO Customer Queue");
            Iterator<CustomerOrder> itr = customerName.iterator();
            while (itr.hasNext()){
                customerToBuy.add(customerName.poll());

            }
            System.out.println(customerToBuy);
        } else{

            for (CustomerOrder customerOrder : orderList) {
                customerOrderPriorityQueue.add(customerOrder);
            }
            Iterator<CustomerOrder> it = customerOrderPriorityQueue.iterator();
            while (it.hasNext()) {
                customerToBuy.add(customerOrderPriorityQueue.poll());

            }
        }
    }


}





