package com.devskiller.tasks.blog.model.dto;

import java.time.LocalDateTime;

public class PostDto {

	private String id;
	private String title;
	private String content;
	private LocalDateTime creationDate;


	public PostDto(String id, String title, String content, LocalDateTime creationDate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.creationDate = creationDate;
	}

	public PostDto(String title, String content, LocalDateTime creationDate) {
		this.title = title;
		this.content = content;
		this.creationDate = creationDate;
	}

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
