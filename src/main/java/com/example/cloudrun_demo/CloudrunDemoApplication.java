package com.example.cloudrun_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CloudrunDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudrunDemoApplication.class, args);
	}

	@RestController
	static class HelloController {
		@Value("${NAME:World}")
		private String name;

		@GetMapping("/")
		public String hello() {
			return "Hello, " + name + "!";
		}
	}
}
