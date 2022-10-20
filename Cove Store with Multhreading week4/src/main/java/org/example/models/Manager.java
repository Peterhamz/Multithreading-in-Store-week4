package org.example.models;

import org.example.services.ManagerAddProducts;
import org.example.services.ManagerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Manager extends Staff implements ManagerService, ManagerAddProducts {


    public Manager() {
        super();
    }

    public Manager(String id, String name, String phoneNumber, String qualification, Integer age, Address address){
        super(id, name, phoneNumber, qualification, age, address);

    }


    @Override
    public boolean employCashier(Store main, HireCashier hireCashier) {
        List<Cashier> staffList = main.getStaffList();
        if (hireCashier.getQualification() == "Graduate" && hireCashier.getAge() > 20){
            Cashier newStaff = new Cashier();
            newStaff.setId(getRandomNumberString());
            newStaff.setAge(hireCashier.getAge());
            newStaff.setName(hireCashier.getName());
            staffList.add(newStaff);

            System.out.println("=============== Employment Status ================");
            System.out.println("\n");
            System.out.println(hireCashier.getName() + " "+ "is employed");
            return true;

        }
        else {
            System.out.println(hireCashier.getName() + " " + "is not qualified");
            return  false;

        }
    }


    @Override
    public void addProduct(Store add, Product product) {
        ArrayList<Product> productList = add.getProductList();
        if (product.getNameOfProduct() != null && product.getPrice() != null ){
            Product newProduct = new Product();

            newProduct.setProductId(product.getProductId());
            newProduct.setNameOfProduct(product.getNameOfProduct());
            newProduct.setCategory(product.getCategory());
            newProduct.setPrice(product.getPrice());
            newProduct.setQuantity(product.getQuantity());

            productList.add(newProduct);
        }

    }

    public static String getRandomNumberString() {
        Random rnd = new Random();
        int number = rnd.nextInt(9999);
        return String.format("%04d", number);
    }

    public static Integer getRandom() {
        Random rnd = new Random();
        int number = rnd.nextInt(999);
        return number;
    }
}
