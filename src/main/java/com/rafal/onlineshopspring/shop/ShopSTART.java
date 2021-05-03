package com.rafal.onlineshopspring.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Profile("start")
public class ShopSTART {

    final private ProductRepository productRepository;

    @Value("${product-info.currency}")
    private String currency;

    @Autowired
    public ShopSTART(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public double getFinalSum() {
        return productRepository.sumOfProducts();
//      return Math.round(((sum + (sum * vatValue) - (sum * discountValue))) * 100.00)/100.00;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("\n*** Online Shop - START ***\n");
        System.out.println("Your products list:");
        productRepository.showProductList();
        System.out.println("\nYou have: " + productRepository.getProductList().size() + " items in your basket, of value: " + getFinalSum() + ",- " + currency);


    }
}