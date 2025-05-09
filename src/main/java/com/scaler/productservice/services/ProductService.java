package com.scaler.productservice.services;
import java.util.List;
import com.scaler.productservice.models.Product;

public interface ProductService {
    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(Product product);
    boolean deleteProduct(Long productId);
}
