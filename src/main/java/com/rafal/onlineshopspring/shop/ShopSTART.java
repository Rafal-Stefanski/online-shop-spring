package com.rafal.onlineshopspring.shop;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("START")
public class ShopSTART {

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("Shop START");
    }
}