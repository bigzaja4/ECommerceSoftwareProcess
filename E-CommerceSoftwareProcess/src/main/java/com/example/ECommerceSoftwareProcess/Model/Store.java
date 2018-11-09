/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Bank Puvadol
 */

@Entity
//@Table(name = "Store")
public class Store implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long storeId;
    @OneToOne
    @JoinColumn(table = "product" )
    private long productId;
    private String storeName;
    private int follower;
    private int totalProduct;

    public Store() {
    }

    public Store(int storeId, int productId, String storeName, int follower, int totalProduct) {
        this.storeId = storeId;
        this.productId = productId;
        this.storeName = storeName;
        this.follower = follower;
        this.totalProduct = totalProduct;
    }

    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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
        return "Store{" + "storeId=" + storeId + ", productId=" + productId + ", storeName=" + storeName + ", follower=" + follower + ", totalProduct=" + totalProduct + '}';
    }
    
    
    
}
