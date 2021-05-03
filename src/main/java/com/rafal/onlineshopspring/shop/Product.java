package com.rafal.onlineshopspring.shop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Product {
    private String name;
    private double price;

    @Value("${product-info.currency}")
    private String currency;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
        this.price = Math.round(50.00 + new Random().nextDouble() * (300.00 - 50.00));
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product name: '" + name + '\'' +
                ", price " + price + ",- " + currency;
    }
}
