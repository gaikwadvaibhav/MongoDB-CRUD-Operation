package com.mongodemo.MongoDBDemo.model;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by melayer on 13/10/17.
 */

public class Student {

    @Id
    Integer id;
    String name;
    String age;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    List<Address> addresses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
