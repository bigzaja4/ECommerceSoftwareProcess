/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bank Puvadol
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository proRep;
    
    public Product insertProduct(Product pd){
        return proRep.save(pd);
    }
    
    public List<Product> getAllProduct(){
        return proRep.findAll();
    }
    
    public Product getProductById(int id){
        return proRep.findById(id).get();
    }
    
    public List<Product> addProductToCart(List<Integer> productId){
        List<Product> cart = new ArrayList<>();
        for (Integer id : productId) {
            cart.add(getProductById(id));
        }
        return cart;
    }
}
