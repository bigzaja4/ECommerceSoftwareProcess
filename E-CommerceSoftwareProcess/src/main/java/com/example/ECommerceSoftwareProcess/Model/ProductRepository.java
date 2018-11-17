/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bank Puvadol
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByProductNameLike(String productName);
}
