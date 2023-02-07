package com.exodiaaaa.demo.Service;

import com.exodiaaaa.demo.Models.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);
    List<Product> get();
    Product update(Long id, Product product);
    String delete(Long id);
}
