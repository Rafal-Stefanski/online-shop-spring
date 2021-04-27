package com.rafal.onlineshopspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class OnlineShopSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineShopSpringApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("\n*** Online Shop ***");
    }
}
