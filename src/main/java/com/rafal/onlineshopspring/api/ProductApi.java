package com.rafal.onlineshopspring.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")    // nie trzeba podawać /products przy każdej metodzie
public class ProductApi {

    //    @RequestMapping(value = "/products", method = RequestMethod.GET)
    @RequestMapping(method = RequestMethod.GET)
    public String getProducts() {
        return "Hello World with GET";
    }

//    @GetMapping
//    public String getProducts() {
//        return "Hello World with GET";
//    }

    @PostMapping
    public String addProduct() {
        return "Hello World with POST";
    }

    @PutMapping
    public String modProduct() {
        return "Hello World with PUT";
    }

    @DeleteMapping
    public String removeProduct() {
        return "Hello World with DELETE";
    }


}
