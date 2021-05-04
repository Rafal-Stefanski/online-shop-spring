package com.rafal.onlineshopspring.shop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private final List<Product> productList;

    @Value("${product-info.currency}")     // This doesn't work :(
    private final String currency = "zł";   // that's why zł is given here instead of application.prop

    public ProductRepository() {

        Product product1 = new Product("Product No.1", currency);
        Product product2 = new Product("Product No.2", currency);
        Product product3 = new Product("Product No.3", currency);
        Product product4 = new Product("Product No.4", currency);
        Product product5 = new Product("Product No.5", currency);

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
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public double sumOfProducts() {
        return productList.stream()
                .map(Product::getPrice)
                .reduce(0.00, Double::sum);
    }
}