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
import javax.validation.constraints.NotBlank;

/**
 *
 * @author itarataa
 */
@Entity
@Table(name="Description")
public class Description implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int description;
    private int stockQuantity;
    private String productColor;
    private String picture;
    private String size;
    @OneToOne
    @JoinColumn(name="productId")
    private int productId;

    public Description() {
    }

    public Description(int description, int stockQuantity, String productColor, String picture, String size, int productId) {
        this.description = description;
        this.stockQuantity = stockQuantity;
        this.productColor = productColor;
        this.picture = picture;
        this.size = size;
        this.productId = productId;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    

    @Override
    public String toString() {
        return "Description{" + "description=" + description + ", stockQuantity=" + stockQuantity + ", productColor=" + productColor + ", picture=" + picture + ", size=" + size + ", productId=" + productId + '}';
    }
    
    
    
}
