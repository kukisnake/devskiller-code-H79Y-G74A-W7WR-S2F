package com.devskiller.tasks.blog.model;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
@Entity
public record Post(@Id String id, String title, String content, LocalDateTime creationDate) {
}
