package com.sparta.postapp.domain.post.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sparta.postapp.domain.post.service.dto.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("ports")
@RequiredArgsConstructor
public class PostController {
	// private final PostService postService;

	@PostMapping("/health")
	public String health() {
		return "post-app is running";
	}
}
