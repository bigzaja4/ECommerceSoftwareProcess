/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bank Puvadol
 */
@Service
public class OrderProductService {

   
    @Autowired
    private OrderProductRepository orderRep;
    
    public OrderProduct insertOrderProduct(OrderProduct Order){
        return orderRep.save(Order);
    }
    
}
