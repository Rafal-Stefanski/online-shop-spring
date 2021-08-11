package com.rafal.onlineshopspring.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestApi {

    @GetMapping
//    @RequestMapping(value = "/testWithRequest", method = RequestMethod.GET)
    public ResponseEntity<String> get() {
        return new ResponseEntity("Hello World!", HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping
    public String getThis() {
        return "test DeleteMapping";
    }

    @PostMapping
    public String postMapping() {
        return "Hello test with POST";
    }
}
