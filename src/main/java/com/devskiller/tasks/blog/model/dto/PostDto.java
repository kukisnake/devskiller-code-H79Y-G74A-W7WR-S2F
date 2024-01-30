package com.devskiller.tasks.blog.model.dto;

import java.time.LocalDateTime;

public record PostDto(String id, String title, String content, LocalDateTime creationDate) {
}
