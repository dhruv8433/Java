package com.example.springinit.error;

// class that handle product not found exception
public class ProductNotFound extends RuntimeException {
    public ProductNotFound(String message) {
        super(message);
    }
}
