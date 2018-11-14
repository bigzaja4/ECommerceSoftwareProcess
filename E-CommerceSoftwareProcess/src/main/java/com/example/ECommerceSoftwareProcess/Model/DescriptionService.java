/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author itarataa
 */
@Service
public class DescriptionService {
    
    @Autowired
    private DescriptionRespository descriptionRespository;
    
    public Description insertDescription(Description description){
        return descriptionRespository.save(description);
}
    
    public List<Description> getAllDescription(){
        return descriptionRespository.findAll();
    }
          
    public Description getById(int id){
        return descriptionRespository.findById(id).get();
    }
}
