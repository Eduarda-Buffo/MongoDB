package com.eduarda.cursomongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eduarda.cursomongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}