package com.productDetails.service;

import com.productDetails.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProduct();
    Optional<Product> getProductById(int id);
   Product addProduct(Product product);
   void deleteProduct(int id);
}
