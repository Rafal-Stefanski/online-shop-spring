package com.rafal.onlineshopspring.shop;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("PRO")
@ConfigurationProperties(prefix = "pro-parameter")
public class ShopPRO {

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("ShopPremium");
    }
}
