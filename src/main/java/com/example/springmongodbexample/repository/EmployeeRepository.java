package com.example.springmongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.springmongodbexample.document.Employee;

@Repository
public interface EmployeeRepository extends  MongoRepository<Employee,Integer> {

}
