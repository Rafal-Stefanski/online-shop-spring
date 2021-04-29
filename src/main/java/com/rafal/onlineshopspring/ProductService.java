package com.rafal.onlineshopspring;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public ProductService() {
        Product product1 = new Product("product nr 1", 50.00);
        Product product2 = new Product("product nr 2", 75.00);
        Product product3 = new Product("product nr 3", 100.00);
        Product product4 = new Product("product nr 4", 125.00);
        Product product5 = new Product("product nr 5", 150.00);

//        productList = new ArrayList<>();
//        productList.add(product1);
//        productList.add(product2);
//        productList.add(product3);
//        productList.add(product4);
//        productList.add(product5);


    }
}
