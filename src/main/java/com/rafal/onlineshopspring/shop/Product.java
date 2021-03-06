package com.rafal.onlineshopspring.shop;

import org.springframework.beans.factory.annotation.Value;

import java.util.Random;

public class Product {
    private final String name;
    private final double price;

    @Value("${product-info.currency}")   // This doesn't work, unfortunately currency is declared in ProductRepository :(
    private final String currency;

    public Product(String name, String currency) {
        this.name = name;
        this.price = Math.round((50.00 + new Random().nextDouble() * (300.00 - 50.00)) * 100.00) / 100.00;
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {   // needed for method get in ProductController to show JASON of Product List.
        return name;
    }

    public String getCurrency() {   // needed for method get in ProductController to show JASON of Product List.
        return currency;
    }

    @Override
    public String toString() {
        return "Product name: '" + name + '\'' +
                ", price " + price + ",- " + this.currency;
    }
}
