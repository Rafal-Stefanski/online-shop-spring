package com.rafal.onlineshopspring.CarTest;

import org.springframework.stereotype.Service;

@Service
public class VisaService implements Card {

    public VisaService() {

    }

    @Override
    public String getInfo() {
        return "VisaService";
    }
}
