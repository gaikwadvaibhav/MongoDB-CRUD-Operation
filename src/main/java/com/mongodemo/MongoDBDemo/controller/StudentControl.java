package com.mongodemo.MongoDBDemo.controller;

import com.mongodemo.MongoDBDemo.model.Address;
import com.mongodemo.MongoDBDemo.model.Student;
import com.mongodemo.MongoDBDemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by melayer on 13/10/17.
 */
@RestController
public class StudentControl {

    @Autowired
    StudentRepo studentRepo;

    @PostMapping(value = "/insertstud")
    String insert(@RequestBody Student student){
        studentRepo.save(student);
        return "Data Inserted";
    }

    @GetMapping(value = "/getstud")
    List<Student> getstud(){
        List<Student> list=studentRepo.findAll();
        return list;
    }

    @GetMapping(value = "/getstudone")
    Student getstud(@RequestParam Integer id){
        Student list=studentRepo.findOne(id);
        return list;
    }

    @GetMapping(value = "/getstudadd")
    List<Address> getstudadd(@RequestParam Integer id){
        Student list=studentRepo.findOne(id);
        List<Address> la=list.getAddresses();
        return la;
    }




}
