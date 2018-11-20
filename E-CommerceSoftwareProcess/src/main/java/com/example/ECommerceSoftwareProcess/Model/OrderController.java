/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import java.util.List;
import javax.persistence.criteria.Order;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bank Puvadol
 */
@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
public class OrderController {
    @Autowired
    private OrderProductService orderService;
    
  
    
    @PostMapping("/success")
    public ResponseEntity<?> insertOrderService(@RequestBody @Valid OrderProduct Order){
        System.out.println("-----------------------------------------------------");
        System.out.println(Order);
        OrderProduct o = orderService.insertOrderProduct(Order);
        return ResponseEntity.status(HttpStatus.CREATED).body(o);
    }
    
    @GetMapping("/")
    public List<OrderProduct> getOrderSer(){
        return orderService.getAllOrderProduct();
    }
    
    @GetMapping("/{id}")
    public OrderProduct getOneProduct(@PathVariable int id){
        System.out.println("------------------------------"+id);
        return orderService.getById(id);
    }
    
    
//    @PostMapping("order/success")
//    public void insertOrder(OrderProduct order){
//        System.out.println("---------------------------");
//        orderService.insertOrderProduct(order);
//    }
}
