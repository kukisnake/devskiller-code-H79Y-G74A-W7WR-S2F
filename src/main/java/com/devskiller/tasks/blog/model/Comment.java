package com.devskiller.tasks.blog.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

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
	// Default constructor
	public Comment() {
		this(null, null, null, null, null);
	}

	public Comment(Post post, String author, String content) {
		this(null, post, author, content, null); // Constructor without id and creationDate
	}
}
