package com.rafal.onlineshopspring.shop;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> productList;

    public ProductRepository() {
        Product product1 = new Product("Product nr 1", 50.00);
        Product product2 = new Product("Product nr 2", 75.00);
        Product product3 = new Product("Product nr 3", 100.00);
        Product product4 = new Product("Product nr 4", 125.00);
        Product product5 = new Product("Product nr 5", 150.00);

        productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<Product> getItems() {
        return productList;
    }
}
