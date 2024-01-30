package com.devskiller.tasks.blog.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
public record Post(@Id String id, String content, String title, LocalDateTime creationDate) {
}
