package com.devskiller.tasks.blog.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@ManyToOne
	private Post post;

	private String author;
	private String content;
	private LocalDateTime creationDate;


	public Comment(String id, Post post, String author, String content, LocalDateTime creationDate) {
		this.id = id;
		this.post = post;
		this.author = author;
		this.content = content;
		this.creationDate = creationDate;
	}

	public Comment() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
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
