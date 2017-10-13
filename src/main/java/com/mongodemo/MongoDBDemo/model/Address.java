package com.mongodemo.MongoDBDemo.model;

import java.util.List;

/**
 * Created by melayer on 13/10/17.
 */

public class Address {

    String street;
    String area;
    String city;
    Integer pin;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", pin=" + pin +
                '}';
    }



    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }



}
