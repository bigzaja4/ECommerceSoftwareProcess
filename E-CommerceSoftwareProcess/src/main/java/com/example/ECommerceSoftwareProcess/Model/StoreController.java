/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bank Puvadol
 */
@RestController
public class StoreController {
    @Autowired
    private StoreService storeService;

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/productaddtostore"
    )
    public Store insertProduct(@RequestBody Store st) {
        return storeService.insertStoreServ(st);
    }
    
    @GetMapping("/store")
    public List<Store> sadas(){
        return storeService.asdas();
    }
}
