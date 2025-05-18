package com.scaler.productservice.exceptions;

public class ProductNotFoundException extends Exception{
    private final Long productId;
    public ProductNotFoundException(String message, Long productId) {
        super(message);
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }
}
