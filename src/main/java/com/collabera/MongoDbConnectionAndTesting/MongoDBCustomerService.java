package com.collabera.MongoDbConnectionAndTesting;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoDBCustomerService extends MongoRepository<Student, String> {
	
}
