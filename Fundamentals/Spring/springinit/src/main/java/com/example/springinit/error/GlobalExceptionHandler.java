package com.example.springinit.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler; // Import required for exception handling
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Global exception handler to manage exceptions across the entire application.
 * This class helps in handling exceptions in a centralized manner, making code cleaner and more maintainable.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handles ProductNotFound exceptions and returns a structured JSON response.
     *
     * @param e the exception thrown when a product is not found.
     * @return ResponseEntity with an error message and HTTP status 404 (Not Found).
     */
    @ExceptionHandler(ProductNotFound.class) // Specifies that this method handles ProductNotFound exceptions
    public ResponseEntity<Map<String, String>> handleProductNotFound(ProductNotFound e) {
        // Creating a map to store the error response
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", e.getMessage()); // Adding error message to the response map

        // Returning a ResponseEntity with the error map and HTTP status 404
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
