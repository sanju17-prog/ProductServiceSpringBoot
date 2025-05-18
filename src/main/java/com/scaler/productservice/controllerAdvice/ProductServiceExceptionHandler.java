package com.scaler.productservice.controllerAdvice;

import com.scaler.productservice.dtos.ExceptionDto;
import com.scaler.productservice.dtos.ProductNotFoundExceptionDto;
import com.scaler.productservice.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.config.PropertyResourceConfigurer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceExceptionHandler {
    private final PropertyResourceConfigurer propertyResourceConfigurer;

    public ProductServiceExceptionHandler(PropertyResourceConfigurer propertyResourceConfigurer) {
        this.propertyResourceConfigurer = propertyResourceConfigurer;
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionDto> handleRuntimeException(){
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMessage("Something went wrong!");
        exceptionDto.setResolutionDetails("Please try again later... Make sure you have a valid credentials!");
        return new ResponseEntity<>(
                exceptionDto,
                HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ProductNotFoundExceptionDto> handleProductNotFoundException(ProductNotFoundException ex){
        ProductNotFoundExceptionDto productNotFoundExceptionDto = new ProductNotFoundExceptionDto();
        productNotFoundExceptionDto.setMessage("Product not found!");
        productNotFoundExceptionDto.setProductId(ex.getProductId());
        productNotFoundExceptionDto.setResolution("Please check the product id and try again!");
        return new ResponseEntity<>(
                productNotFoundExceptionDto,
                HttpStatus.NOT_FOUND);
    }
}
