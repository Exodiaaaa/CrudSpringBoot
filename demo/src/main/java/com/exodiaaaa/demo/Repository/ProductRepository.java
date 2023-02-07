package com.exodiaaaa.demo.Repository;

import com.exodiaaaa.demo.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
