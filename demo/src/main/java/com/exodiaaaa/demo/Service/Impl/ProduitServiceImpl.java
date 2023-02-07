package com.exodiaaaa.demo.Service.Impl;

import com.exodiaaaa.demo.Models.Product;
import com.exodiaaaa.demo.Repository.ProductRepository;
import com.exodiaaaa.demo.Service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> get() {
        return productRepository.findAll();
    }

    @Override
    public Product update(Long id, Product product) {
        return productRepository.findById(id)
                .map(p->{
                    p.setName(product.getName());
                    p.setDescription(product.getDescription());
                    p.setPrice(product.getPrice());
                    return productRepository.save(p);
                }).orElseThrow(()->new RuntimeException("Product Not Found"));

    }

    @Override
    public String delete(Long id) {
        productRepository.deleteById(id);
        return "Le produit "+ id + "A été supprimer avec success";
    }
}
