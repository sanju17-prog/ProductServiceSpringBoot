package com.scaler.productservice.controllers;

import com.scaler.productservice.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
//    private HttpStatus status;

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId){
        // should we call Fakestore api here?
        // No, we will not call external APIs in this project.
        // Create service layer to call external APIs.
        return new Product();
    }

    @GetMapping("/")
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }

    @PostMapping("/")
    public Product createProduct(@RequestBody Product product){
        Product newProduct;
        newProduct = new Product();
        return newProduct;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long productId){
        return null;
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product){
        return new Product();
    }

    @PatchMapping("/id")
    public Product updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){
        return new Product();
    }
}


/*
CRUD operations on a Product model
 */