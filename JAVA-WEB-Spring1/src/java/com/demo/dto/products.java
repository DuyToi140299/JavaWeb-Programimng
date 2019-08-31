/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dto;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class products {
    private int id;
    private String name;
    private String description;
    private String images;
    private int author_id;
    private int actived;
    private Date created_at;
    private Date updated_at;

    public products() {
    }

    public products(int id, String name, String description, String images, int author_id, int actived, Date created_at, Date updated_at) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.images = images;
        this.author_id = author_id;
        this.actived = actived;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public int getActived() {
        return actived;
    }

    public void setActived(int actived) {
        this.actived = actived;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
    
    
}
