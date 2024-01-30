package com.devskiller.tasks.blog.model.dto;

import java.time.LocalDateTime;

public class CommentDto {

	private String id;
	private String author;
	private String content;
	private LocalDateTime createdAt;

	// Constructors
	// Getters and setters

	public CommentDto(String id, String content, String author, LocalDateTime createdAt) {
		this.id = id;
		this.content = content;
		this.author = author;
		this.createdAt = createdAt;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
}
