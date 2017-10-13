package com.mongodemo.MongoDBDemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by melayer on 11/10/17.
 */
@Document
public class Customer {


    @Id
    String id;
    String custname;
    String custcity;


    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", custname='" + custname + '\'' +
                ", custcity='" + custcity + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCustcity() {
        return custcity;
    }

    public void setCustcity(String custcity) {
        this.custcity = custcity;
    }















}
