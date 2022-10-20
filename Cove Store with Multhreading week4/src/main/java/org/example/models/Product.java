package org.example.models;

import java.util.ArrayList;
import java.util.List;

import static org.example.models.Store.productList;

public class Product {
    private static List<Product> productList1 = new ArrayList<>();

    private Integer productId;
    private String nameOfProduct;
    private String category;

    private Double price;

    private Integer quantity;

    public Product() {

    }

    public Product(Integer productId, String nameOfProduct, String category, Double price, Integer quantity) {
        this.productId = productId;
        this.nameOfProduct = nameOfProduct;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getNameOfProduct() {

        return nameOfProduct;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public static ArrayList<Product> getProductList() {
        return productList;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static List<Product> getProductList1() {
        return productList1;
    }
}
