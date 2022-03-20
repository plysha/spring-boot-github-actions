package com.plyshaa.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdApplication {

	@GetMapping("/hello")
	public String greeting() {
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdApplication.class, args);
	}

}
