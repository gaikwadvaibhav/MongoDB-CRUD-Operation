package com.mongodemo.MongoDBDemo.controller;

import com.mongodemo.MongoDBDemo.model.Customer;
import com.mongodemo.MongoDBDemo.repository.CustmerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by melayer on 11/10/17.
 */
@RestController
public class Customer_Control {

    @Autowired
    CustmerRepo custmerRepo;

    @PostMapping("/insert")
    String insert(@RequestBody Customer customer){
        custmerRepo.save(customer);
        return "Document_inserted";
    }

    @GetMapping("/getdata")
    List<Customer> getdata(){
        List<Customer> list=custmerRepo.findAll();
        return list;
    }

    @GetMapping(value = "/getdataone")
    Customer getdataone(@RequestParam String id){
        Customer list=custmerRepo.findOne(id);
        return list;
    }

    @GetMapping(value = "/findbyname")
    Customer findbyname(@RequestParam String custname){
        Customer list=custmerRepo.findByCustname(custname);
        return list;
    }

    @GetMapping(value = "/findbycity")
    Customer findbycity(@RequestParam String custcity){
        Customer list=custmerRepo.findByCustcity(custcity);
        return list;
    }


    @PostMapping("/delete")
    String delete(@RequestParam String id){
        custmerRepo.delete(id);
        return "Document_Deleted";
    }

}
