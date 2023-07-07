package com.products.controller;

import com.products.dto.Product;
import com.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome this is a pdf generator";
    }

    @GetMapping("/all")
    public List<Product> getAllTheProducts(){
        return service.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProduct(id);
    }

}
