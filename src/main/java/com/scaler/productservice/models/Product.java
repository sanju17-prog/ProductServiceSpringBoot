package com.scaler.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "products")
public class Product extends BaseModel {
    private String title;
    private double price;
    private String description;
    private String imageUrl;
    @ManyToOne
    private Category category;
}
