package com.example.springinit.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springinit.model.ProductDTO;
import com.example.springinit.repository.ProductRepository;
import com.example.springinit.error.ProductNotFound;
import com.example.springinit.model.Product;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductRepository productRepository;

    // Post Request for adding products
    @PostMapping()
    public String addProduct(@RequestBody @Valid ProductDTO productDTO) {
        logger.info("Creating a new product  : {}", productDTO.getName());

        Product product = new Product(productDTO.getName(), productDTO.getPrice());

        productRepository.save(product);
        return "Product added successfully";
    }

    // Get Request for getting all products
    @GetMapping()
    public List<ProductDTO> getAllProducts() {
        logger.info("Fetching all products");
        return productRepository.findAll().stream()
                .map(product -> new ProductDTO(product.getId(), product.getName(), product.getPrice())).toList(); // return all products
    }

    // Get Product by ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {

        return productRepository.findById(id)
                .orElseThrow(() -> {
                    logger.error("Product with ID {} not found", id);
                    return new ProductNotFound("Product with ID " + id + " not found");
                }); // return product by id

        // return products.stream()
        // .filter(product -> product.getId() == id)
        // .findFirst()
        // .orElse(null);
    }

    // Update (PULL) - update product details
    @PutMapping("/{id}")
    public String updateProductDetails(@PathVariable int id, @RequestBody Product updateProduct) {
        // for(Product product : products){
        // if(product.getId() == id){
        // product.setName(updateProduct.getName());
        // product.setPrice(updateProduct.getPrice());
        // return "Product details updated successfully";
        // }
        // }
        if (productRepository.existsById(id)) {
            updateProduct.setId(id);
            productRepository.save(updateProduct);
            return "Product updated successfully!";
        }
        return "Product Not Found!!";
    }

    // Delete (DELETE) - delete product based on id
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        // products.removeIf(product -> product.getId() == id);
        // return "Product deleted successfully";
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return "Product deleted successfully!";
        }
        return "Product not found!";
    }
}
