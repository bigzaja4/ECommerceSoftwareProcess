/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Bank Puvadol
 */

@Entity
@Table(name = "Store")
public class Store implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeId;
    
    @NotNull
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Product> products;
    private String storeName;
    private int follower;
    private int totalProduct;

    public Store() {
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public List<Product> getProduct() {
        return this.products;
    }

    public void setProduct(List<Product> product) {
        this.products = product;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(int totalProduct) {
        this.totalProduct = totalProduct;
    }

    @Override
    public String toString() {
        return "Store{" + "storeId=" + storeId + ", productId=" + ", storeName=" + storeName + ", follower=" + follower + ", totalProduct=" + totalProduct + '}';
    }
    
    
    
}
