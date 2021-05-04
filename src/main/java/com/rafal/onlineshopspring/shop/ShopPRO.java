package com.rafal.onlineshopspring.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Profile("pro")
public class ShopPRO {

    final private ProductRepository productRepository;

    @Value("${product-info.currency}")
    private String currency;

    @Value("${product-info.vat}")
    private double vatValue;

    @Value("${product-info.discount}")
    private double discountValue;

    @Autowired
    public ShopPRO(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public double getSum() {
        return productRepository.sumOfProducts();
    }

    public double getFinalSum() {
        double sum = productRepository.sumOfProducts();
        return Math.round(((sum + (sum * vatValue))) * 100.00) / 100.00;
    }

    public double getFinalSumAfterDiscount() {
        double sum = productRepository.sumOfProducts();
        return Math.round(((sum + (sum * vatValue) - (sum * discountValue))) * 100.00) / 100.00;

    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("\n*** Online Shop - PRO ***\n");
        System.out.println("Your products list:");
        productRepository.showProductList();
        System.out.println("\nYou have: " + productRepository.getProductList().size() + " items in your basket, of value: " + getSum() + ",- " + currency +
                "\nIncluding VAT (" + vatValue * 100 + "%): " + getFinalSum() + ",- " + currency +
                "\nWith discount (" + discountValue * 100 + "%): " + getFinalSumAfterDiscount() + ",- " + currency);
    }

}
