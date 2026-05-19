package com.aditya.simplewebapp.Service;

import com.aditya.simplewebapp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"iPhone",50000),
            new Product(102,"Samsung",40000),
            new Product(103,"Oppo",30000)
    ));
    public List<Product> getAllProducts(){
        return products;
    }
    public Product getProductById(int id){
        return products.stream().filter(p -> p.getProdId() == id)
                .findFirst().orElse(new Product(100,"Not Found",0));
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void updateProduct(Product product){
        for(int i=0;i<products.size();i++) {
            if (products.get(i).getProdId() == product.getProdId()) {
                products.set(i, product);
            }
        }
    }
    public void deleteProduct(int id){
        products.removeIf(p -> p.getProdId() == id);
    }
}
