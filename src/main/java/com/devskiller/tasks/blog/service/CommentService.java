package com.devskiller.tasks.blog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devskiller.tasks.blog.model.Comment;
import com.devskiller.tasks.blog.model.Post;
import com.devskiller.tasks.blog.model.dto.CommentDto;
import com.devskiller.tasks.blog.model.dto.NewCommentDto;
import com.devskiller.tasks.blog.repository.CommentRepository;
import com.devskiller.tasks.blog.repository.PostRepository;

@Service
public class CommentService {

	private final PostRepository postRepository;
	private final CommentRepository commentRepository;

	@Autowired
	public CommentService(PostRepository postRepository, CommentRepository commentRepository) {
		this.postRepository = postRepository;
		this.commentRepository = commentRepository;
	}

	public List<CommentDto> getCommentsForPost(String postId) {
		List<Comment> comments = commentRepository.findByPostIdOrderByCreatedAtDesc(postId);
		return comments.stream()
			.map(this::mapToCommentDto)
			.collect(Collectors.toList());
	}

	public String addComment(String postId, NewCommentDto newCommentDto) {
		Post post = postRepository.findById(postId)
			.orElseThrow(() -> new IllegalArgumentException("No post found with id: " + postId));

		Comment comment = new Comment();
		comment.setPost(post);
		comment.setAuthor(newCommentDto.getAuthor());
		comment.setContent(newCommentDto.getContent());
		Comment savedComment = commentRepository.save(comment);
		return savedComment.getId();
	}

	public Comment getCommentById(String commentId) {
		return commentRepository.findById(commentId)
			.orElseThrow(() -> new IllegalArgumentException("No comment found with id: " + commentId));
	}

	private CommentDto mapToCommentDto(Comment comment) {
		return new CommentDto(comment.getId(), comment.getContent(), comment.getAuthor(), comment.getCreatedAt());
	}
}
