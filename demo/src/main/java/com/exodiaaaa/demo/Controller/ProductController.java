package com.exodiaaaa.demo.Controller;

import com.exodiaaaa.demo.Models.Product;
import com.exodiaaaa.demo.Service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/create")
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping("/get")
    public List<Product> getAll(){
        return productService.get();
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable Long id,@RequestBody Product product){
        return productService.update(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        return productService.delete(id);
    }

}
