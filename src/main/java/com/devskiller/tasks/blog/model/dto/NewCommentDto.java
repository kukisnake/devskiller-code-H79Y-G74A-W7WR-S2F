package com.devskiller.tasks.blog.model.dto;

public class NewCommentDto {

	private String author;
	private String content;


	public NewCommentDto(String author, String content) {
		this.author = author;
		this.content = content;
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
}
