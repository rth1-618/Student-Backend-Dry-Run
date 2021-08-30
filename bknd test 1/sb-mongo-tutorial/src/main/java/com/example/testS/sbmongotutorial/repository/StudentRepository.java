package com.example.testS.sbmongotutorial.repository;

import com.example.testS.sbmongotutorial.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student,String> {

    @Query("{'sid': ?0}")
    Optional<Student> findBySID(String sid);
}
