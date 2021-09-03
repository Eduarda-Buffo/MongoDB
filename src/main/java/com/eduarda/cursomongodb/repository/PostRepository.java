package com.eduarda.cursomongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eduarda.cursomongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}