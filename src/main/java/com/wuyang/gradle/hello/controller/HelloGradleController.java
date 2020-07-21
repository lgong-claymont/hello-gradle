package com.wuyang.gradle.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloGradleController {
	@RequestMapping("hello")
	public String helloGradle () {
		return "Hello Gradle...";
	}
}
