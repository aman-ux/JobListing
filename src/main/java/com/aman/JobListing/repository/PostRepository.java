package com.aman.JobListing.repository;

import com.aman.JobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>{
}
