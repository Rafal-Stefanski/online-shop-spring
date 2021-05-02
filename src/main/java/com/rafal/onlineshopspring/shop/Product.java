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

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "product: {" +
                "name: '" + name + '\'' +
                ", price " + price + ",- " + currency +
                '}';
    }
}
