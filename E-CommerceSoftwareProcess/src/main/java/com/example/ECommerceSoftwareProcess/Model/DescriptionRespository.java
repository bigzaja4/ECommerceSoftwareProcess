/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author itarataa
 */
@Repository
public interface DescriptionRespository extends JpaRepository<Description, Integer>{

    public Description save(Description description);
    
}
