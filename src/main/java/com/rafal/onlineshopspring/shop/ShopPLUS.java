package com.rafal.onlineshopspring.shop;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Profile("plus")
@ConfigurationProperties(prefix = "plus-parameter")
public class ShopPLUS {

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("\n*** Online Shop - PLUS ***\n");
    }


}
