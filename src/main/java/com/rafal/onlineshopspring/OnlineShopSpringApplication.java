package com.rafal.onlineshopspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class OnlineShopSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineShopSpringApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("\n*** Online Shop ***\n");
    }

    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
        source.setBasename("classpath:i18n/messages");
        source.setDefaultEncoding("UTF-8");
        return source;
    }


}
