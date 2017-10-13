package com.mongodemo.MongoDBDemo.repository;

import com.mongodemo.MongoDBDemo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by melayer on 11/10/17.
 */
@Repository
public interface CustmerRepo extends MongoRepository<Customer, String>{
    Customer findByCustname(String custname);

    Customer findByCustcity(String custname);
}
