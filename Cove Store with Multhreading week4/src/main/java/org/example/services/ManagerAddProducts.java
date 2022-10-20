package org.example.services;

import org.example.models.Product;
import org.example.models.Store;

public interface ManagerAddProducts {

    void addProduct(Store add, Product product);
}