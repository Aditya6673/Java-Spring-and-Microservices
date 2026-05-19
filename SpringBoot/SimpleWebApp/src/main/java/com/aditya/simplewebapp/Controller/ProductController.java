package com.aditya.simplewebapp.Controller;

import com.aditya.simplewebapp.Model.Product;
import com.aditya.simplewebapp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getProduct(){
        return service.getAllProducts();
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }
    @PostMapping ("/products/add")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }
    @PutMapping("/products/update")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }
    @DeleteMapping("/products/delete/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
    }
}
