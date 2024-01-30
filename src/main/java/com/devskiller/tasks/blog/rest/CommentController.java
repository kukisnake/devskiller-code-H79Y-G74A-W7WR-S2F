package com.devskiller.tasks.blog.rest;

import com.devskiller.tasks.blog.model.Comment;
import com.devskiller.tasks.blog.model.dto.CommentDto;
import com.devskiller.tasks.blog.model.dto.NewCommentDto;
import com.devskiller.tasks.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

	private final CommentService commentService;

	@Autowired
	public CommentController(CommentService commentService) {
		this.commentService = commentService;
	}

	@PostMapping("/{id}")
	public String addComment(@PathVariable String id, @RequestBody NewCommentDto commentRequest) {
		return commentService.addComment(id, commentRequest);
	}

	@GetMapping("/posts/{id}")
	public List<CommentDto> getComments(@PathVariable String id) {
		return commentService.getCommentsForPost(id);
	}
}
