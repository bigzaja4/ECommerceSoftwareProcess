/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bank Puvadol
 */
@RestController
@CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
public class OrderController {
    @Autowired
    private OrderProductService orderService;
    
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/order"
    )
    
    public OrderProduct insertOrderService(@RequestBody @Valid OrderProduct Order){
        return orderService.insertOrderProduct(Order);
    }
    
    @GetMapping("/order")
    public List<OrderProduct> getOrderSer(){
        return orderService.getAllOrderProduct();
    }
    
    @GetMapping("/order/{id}")
    public OrderProduct getById(@PathVariable int id){
        return orderService.getById(id);
    }
}
