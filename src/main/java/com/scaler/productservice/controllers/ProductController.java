package com.scaler.productservice.controllers;

import com.scaler.productservice.models.Product;
import com.scaler.productservice.services.ProductService;
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

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId){
        // should we call Fakestore api here?
        // No, we will not call external APIs in this project.
        // Create service layer to call external APIs.
        return productService.getSingleProduct(productId);
    }

    @GetMapping("/")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/")
    public Product createProduct(@RequestBody Product product){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long productId){
        return null;
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product){
        return null;
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){
        return null;
    }
}


/*
CRUD operations on a Product model
 */