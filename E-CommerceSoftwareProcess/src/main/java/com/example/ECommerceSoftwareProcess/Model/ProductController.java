/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bank Puvadol
 */
@RestController
@CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
public class ProductController {

    @Autowired
    private ProductService prodServ;
    private List<Product> cart = new ArrayList<>();

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/productadd"
    )
    public Product insertProduct(@RequestBody Product pd) {
        return prodServ.insertProduct(pd);
    }
    
    @GetMapping("/product")
    public List<Product> getProSer(){
        return prodServ.getAllProduct();
    }
    
    @GetMapping("/productId/{id}")
    public Product getOneProduct(@PathVariable int id){
        
        return prodServ.getProductById(id);
    }
    
    @GetMapping("/product/{productName}")
    public List<Product> getProductByName(@PathVariable String productName){
        return prodServ.getProductByName("%"+productName+"%");
    }
}
