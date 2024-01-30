package com.devskiller.tasks.blog.model.dto;

import java.time.LocalDateTime;

public class CommentDto {

	private String id;
	private String author;
	private String content;
	private LocalDateTime creationDate;


	public CommentDto(String id, String content, String author, LocalDateTime creationDate) {
		this.id = id;
		this.content = content;
		this.author = author;
		this.creationDate = creationDate;
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

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
}
