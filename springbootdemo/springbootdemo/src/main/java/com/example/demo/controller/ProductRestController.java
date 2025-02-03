package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.product.Product;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

    // In-memory list to store products temporarily
    private List<Product> productList = new ArrayList<>();

    // POST endpoint to save a product
    @PostMapping
    public String saveProduct(@RequestBody Product product) {
        // Add the product to the in-memory list
        productList.add(product);
        System.out.println("Product saved: " + product);  // Printing to console
        return "Product is saved!";
    }

    // GET endpoint to retrieve a single product by its ID
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Integer id) {
        // Search for the product by ID in the in-memory list
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;  // Return the found product
            }
        }
        return null;  // Return null if product with given ID is not found
    }

    // GET endpoint to retrieve all products
    @GetMapping
    public List<Product> getAllProducts() {
        return productList;  // Return the in-memory list of all products
    }
}

