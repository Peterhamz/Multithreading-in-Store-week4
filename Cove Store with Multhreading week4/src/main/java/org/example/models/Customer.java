package org.example.models;

import org.example.services.CustomerService;

import java.io.IOException;
import java.util.*;

public class Customer implements CustomerService {
    private static ArrayList<Product> productList;
    private static Integer customerId;
    private  String nameOfCustomer;
    private String phoneNumber;
    private String emailAddress;



    Store store = new Store();

    HashMap<String, Integer> productsToBuy = new HashMap<>();

    List<Product> productList1 = new ArrayList<>();
    List <String> customerList = new ArrayList<>();

    public Customer(Integer customerId, String nameOfCustomer, String phoneNumber, String emailAddress) {
        this.customerId = customerId;
        this.nameOfCustomer = nameOfCustomer;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameOfCustomer='" + nameOfCustomer + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", store=" + store +
                ", productList1=" + productList1 +
                ", customerList=" + customerList +
                '}';
    }

    public List<Product> getProductList1() {
        return productList1;
    }

    public Customer(List<String> customerList) {
        this.customerList = customerList;
    }

    public List<String> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<String> customerList) {
        this.customerList = customerList;
    }

    public static Integer getCustomerId() {
        return customerId;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    @Override
    public void buyProduct( String customerPurchase, Integer quantity) throws IOException {



        List <Product> productList1 = Store.ArrayProductList();
        for (int i = 0; i < productList1.size(); i++){
            if(Objects.equals(productList1.get(i).getNameOfProduct(), customerPurchase )){
                if (productList1.get(i).getQuantity() < quantity){

                    throw new RuntimeException("OUT OF STOCK!!!");
                }
                else if (productList1.get(i).getQuantity() > 0){

                    productList1.get(i).setQuantity(productList1.get(i).getQuantity() - quantity);
                }
            }
        }

        //Cashier.sellProduct(customerPurchase, quantity);
        System.out.println(productList1);
        System.out.println();

    }





}