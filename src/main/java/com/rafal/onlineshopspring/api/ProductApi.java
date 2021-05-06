package com.rafal.onlineshopspring.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")    // nie trzeba podawać /products przy każdej metodzie
public class ProductApi {


//    //    @RequestMapping(value = "/products", method = RequestMethod.GET)
//    @RequestMapping(method = RequestMethod.GET) // alternatywnie dla @GetMapping
//    public String getProducts() {
//        return "Hello World with GET";
//    }

    // PARAMETER
//    @GetMapping
//    public String getProducts(@RequestParam String name, @RequestParam(required = false,defaultValue = "") String surname) {
//        return "Hello " + name + " " + surname;
//    }

    // PATH
//    @GetMapping("/{name}")
//    public String getProducts(@PathVariable String name) {
//        return "Hello " + name;
//    }

      // HEADER
//    @GetMapping
//    public String getProducts(@RequestHeader String name) {
//        return "Hello " + name;
//    }

    // BODY
//    @GetMapping
//    public String addProducts(@RequestBody String name) {
//        return "Hello " + name;
//    }

    // PARAMETER + HEADER
    @GetMapping
    public String getProducts(@RequestParam String name,
                              @RequestHeader(required = false, defaultValue = "") String surname) {
        return "Hello " + name + " " + surname;
    }

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
