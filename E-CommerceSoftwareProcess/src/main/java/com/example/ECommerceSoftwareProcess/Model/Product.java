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

/**
 *
 * @author Bank Puvadol
 */

@Entity

//@Table(name = "Product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
//    @OneToOne
//    @JoinColumn(table = "storeId")
    private int storeId;
//    @OneToOne
//    @JoinColumn(table = "descriptionId")
//    private int descriptionId;
//    @OneToOne
//    @JoinColumn(table = "categoryId")
//    private int categoryId;
//    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JoinColumn(table = "reviewId")
//    private int reviewId;
//    @OneToOne
//    @JoinColumn(table = "userId")
//    private int userId;
    
    
    private String productName;
    private double productPrice;
    private String picture;
    private String category;
    
    public Product() {
    }

//    public int getDescriptionId() {
//        return descriptionId;
//    }
//
//    public void setDescriptionId(int descriptionId) {
//        this.descriptionId = descriptionId;
//    }
//
//    public int getCategoryId() {
//        return categoryId;
//    }
//
//    public void setCategoryId(int categoryId) {
//        this.categoryId = categoryId;
//    }
//
//    public int getReviewId() {
//        return reviewId;
//    }
//
//    public void setReviewId(int reviewId) {
//        this.reviewId = reviewId;
//    }
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//    
    

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    
//    @Override
//    public String toString() {
//        return "Product{" + "productId=" + productId + ", storeId=" + storeId + ", descriptionId=" + descriptionId + ", categoryId=" + categoryId + ", reviewId=" + reviewId + ", userId=" + userId + ", productName=" + productName + ", productPrice=" + productPrice + '}';
//    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

    

    

}
