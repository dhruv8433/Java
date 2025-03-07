package com.example.springinit;

// class that handle product not found exception
public class ProductNotFound extends RuntimeException {
    public ProductNotFound(String message) {
        super(message);
    }
}
