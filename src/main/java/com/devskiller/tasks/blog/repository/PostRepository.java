package com.devskiller.tasks.blog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devskiller.tasks.blog.model.Post;

import java.util.Optional;

public interface PostRepository extends MongoRepository<Post, String> {

	Optional<Post> findById(String id);
}
