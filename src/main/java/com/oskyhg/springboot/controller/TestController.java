package com.oskyhg.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class TestController {

	@RequestMapping("")
	@ResponseBody
	String home() {
		System.out.println("hello");
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TestController.class, args);
	}
}