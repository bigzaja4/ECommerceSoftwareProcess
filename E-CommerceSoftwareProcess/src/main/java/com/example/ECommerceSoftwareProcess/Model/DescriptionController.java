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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author itarataa
 */
@RestController
@CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
public class DescriptionController {
    
    @Autowired
    private DescriptionService descriptionService;
    
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/descriptions"
    )
    
    public Description insertDescription(@RequestBody @Valid Description description){
        return descriptionService.insertDescription(description);
    }
    
    @GetMapping("/description")
    public List<Description> getDesSer(){
        return descriptionService.getAllDescription();
    }
    
    @GetMapping("/description/{id}")
    public Description getById(@PathVariable int id){
        return descriptionService.getById(id);
    }
}
