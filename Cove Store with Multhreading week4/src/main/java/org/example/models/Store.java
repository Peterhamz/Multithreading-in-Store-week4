package org.example.models;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Store {
    public static List<Product> productList1 = new ArrayList<>();
    public static List<Product> ArrayProductList() throws IOException {

        String line = "";
        String splitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(
                    "/Users/mac/Downloads/week-three-task-java012/src/main/java/org/example/models/files/LegacyStores - Sheet.csv"));
            String[] products = new String[0];
            while ((line = br.readLine()) != null) {
                products = line.split(splitBy);
                Product product = new Product();
                for (String str : products) {
                    product.setProductId(Integer.parseInt(products[0]));
                    product.setNameOfProduct(products[1]);
                    product.setCategory(products[2]);
                    product.setPrice(Double.parseDouble(products[3]));
                    product.setQuantity(Integer.parseInt(products[4]));

                }
                productList1.add(product);

            }


            return productList1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Product> productList = new ArrayList<>();

    public static List<Cashier> staffList = new ArrayList<>();

    public static ArrayList<Customer> customerList = new ArrayList<>();

    public Store() {
        this.staffList = staffList;
    }


    public List<Cashier> getStaffList() {

        return staffList;
    }

    public void setStaffList(List<Cashier> staffList) {
        this.staffList = staffList;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }


    @Override
    public String toString() {
        return "Store{" +
                "productList1=" + productList1 +
                '}';
    }
}
