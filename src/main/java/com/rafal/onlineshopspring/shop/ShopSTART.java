package com.rafal.onlineshopspring.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Profile("start")
public class ShopSTART {

    final private ProductRepository productRepository;

    @Autowired
    public ShopSTART(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("\n*** Online Shop - START ***\n");
        productRepository.showProductList();

    }
}