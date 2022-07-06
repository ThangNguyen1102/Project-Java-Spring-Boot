package com.example.projectspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {
    @GetMapping("")
    // this request is: http://localhost:8080/product
    List<String> getAllProducts(){
        return List.of("iphone", "ipad");
    }
}
