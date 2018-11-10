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
 * @author Bank Puvadol
 */
@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRep;
    
    public Store insertStoreServ(Store st){
        return storeRep.save(st);
    }
    
    public List<Store> asdas(){
        return storeRep.findAll();
    }
}
