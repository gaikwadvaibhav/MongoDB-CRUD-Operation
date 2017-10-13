package com.mongodemo.MongoDBDemo.repository;

import com.mongodemo.MongoDBDemo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by melayer on 13/10/17.
 */
@Repository
public interface StudentRepo extends MongoRepository<Student,Integer> {

}
