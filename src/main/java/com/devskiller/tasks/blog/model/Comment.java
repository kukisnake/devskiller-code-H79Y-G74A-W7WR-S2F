package com.devskiller.tasks.blog.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public record Comment(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String id,
	@ManyToOne
	Post post,
	String author,
	String content,
	LocalDateTime creationDate
) {
	// If needed, you can add additional methods here
}
