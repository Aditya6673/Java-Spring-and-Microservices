package com.aditya.simplewebapp.Service;

import com.aditya.simplewebapp.Model.Product;
import com.aditya.simplewebapp.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"iPhone",50000),
//            new Product(102,"Samsung",40000),
//            new Product(103,"Oppo",30000)
//    ));
    public List<Product> getAllProducts(){
        return repo.findAll();
    }
    public Product getProductById(int id){
        return repo.findById(id).orElse(new Product());
    }
    public void addProduct(Product product){
        repo.save(product);
    }
    public void updateProduct(Product product){
        repo.save(product);
    }
    public void deleteProduct(int id){
        repo.deleteById(id);
    }
}
