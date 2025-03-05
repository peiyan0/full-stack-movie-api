package com.example.movie;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository // indicate this is a repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
