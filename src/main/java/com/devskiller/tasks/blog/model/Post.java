package com.devskiller.tasks.blog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private String title;
	private String content;
	private LocalDateTime creationDate;

	public Post(String id, String title, String content, LocalDateTime creationDate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.creationDate = creationDate;
	}

	public Post() {
	}

	public Post(String title, String content, LocalDateTime creationDate) {
		this.title = title;
		this.content = content;
		this.creationDate = creationDate;
	}

	// Getters and setters
	// Constructors
	// Other methods as needed

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
}
