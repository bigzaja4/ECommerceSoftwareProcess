///*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author itarataa
 */
@RestController
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
    
}
