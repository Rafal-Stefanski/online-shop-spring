package com.rafal.onlineshopspring.shop;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> productList;

    public ProductRepository() {
        Product product1 = new Product("Product No.1");
        Product product2 = new Product("Product No.2");
        Product product3 = new Product("Product No.3");
        Product product4 = new Product("Product No.4");
        Product product5 = new Product("Product No.5");

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

    public void showProductList() {
        productList.forEach(System.out::println);
    }

    public List<Product> getItems() {
        return productList;
    }
}
