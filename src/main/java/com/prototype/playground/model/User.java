package com.prototype.playground.model;

import com.prototype.playground.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class User implements Serializable {
    private long id;
    private String firstName;
    private String lastName;

    @Autowired
    private Laptop laptop;

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printDetails()
    {
        System.out.println("id="+id+" FirstName="+firstName+" LastName="+lastName+" Laptop id="+laptop.getId());
    }
}
