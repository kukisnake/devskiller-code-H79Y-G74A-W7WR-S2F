package com.devskiller.tasks.blog.rest;

import com.devskiller.tasks.blog.model.Comment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.devskiller.tasks.blog.model.dto.CommentDto;
import com.devskiller.tasks.blog.model.dto.NewCommentDto;
import com.devskiller.tasks.blog.model.dto.PostDto;
import com.devskiller.tasks.blog.service.CommentService;
import com.devskiller.tasks.blog.service.PostService;

@Controller
@RestController
@RequestMapping("/posts")
public class PostController {

	private final PostService postService;
	private final CommentService commentService;

	public PostController(PostService postService, CommentService commentService) {
		this.postService = postService;
		this.commentService = commentService;
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public PostDto getPost(@PathVariable String id) {
		return postService.getPost(id);
	}

	@GetMapping("/{id}/comments")
	@ResponseStatus(HttpStatus.OK)
	public List<CommentDto> getCommentsForPost(@PathVariable String id) {
		return commentService.getCommentsForPost(id);
	}

	@PostMapping("/{id}/comments")
	@ResponseStatus(HttpStatus.CREATED)
	public CommentDto addCommentToPost(@PathVariable String id, @RequestBody NewCommentDto commentRequest) {
		String commentId = commentService.addComment(id, commentRequest);
		Comment comment = commentService.getCommentById(commentId);
		return new CommentDto(comment.getId(), comment.getContent(), comment.getAuthor(), comment.getCreationDate());
	}
}
