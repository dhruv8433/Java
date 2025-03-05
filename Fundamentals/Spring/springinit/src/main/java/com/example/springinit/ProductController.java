package com.example.springinit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/products")
public class ProductController {
    // create a new array of products
    private List<Product> products = new ArrayList<Product>();

    // Post Request for adding products
    @PostMapping()
    public String addProduct(@RequestBody Product product) {
        products.add(product);
        return "Product added successfully";
    }

    // Get Request for getting all products
    @GetMapping()
    public List<Product> getAllProducts() {
        return products; // return all products
    }
    
    // Get Product by ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {

        return products.stream()
            .filter(product -> product.getId() == id)
            .findFirst()
            .orElse(null);
    }

    // Update (PULL) - update product details
    @PutMapping("/{id}")
    public String updateProductDetails(@PathVariable int id, @RequestBody Product updateProduct) {
        for(Product product : products){
            if(product.getId() == id){
                product.setName(updateProduct.getName());
                product.setPrice(updateProduct.getPrice());
                return "Product details updated successfully";
            }
        }
        return "Product Not Found!!";
    }
    
    // Delete (DELETE) - delete product based on id
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id){
        products.removeIf(product -> product.getId() == id);
        return "Product deleted successfully";
    }
}
