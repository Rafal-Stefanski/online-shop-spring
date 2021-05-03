package com.rafal.onlineshopspring.shop;

import java.util.Random;

public class Product {
    private final String name;
    private final double price;
    private final String currency;

    public Product(String name, String currency) {
        this.name = name;
        this.price = Math.floor(50.00 + new Random().nextDouble() * (300.00 - 50.00));
        this.currency = currency;
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
