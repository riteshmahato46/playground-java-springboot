package com.prototype.playground.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Laptop {
    private int id;
    private String model;
    private Date expiry;

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}
