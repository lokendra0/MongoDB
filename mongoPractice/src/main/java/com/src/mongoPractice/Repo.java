package com.src.mongoPractice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repo  extends MongoRepository<StudentModel, Integer>{

}
