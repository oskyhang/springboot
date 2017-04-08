package com.oskyhg.springboot.controller;

import com.oskyhg.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

	@RequestMapping("/dologin")
	public User getdemo() {
		User p = new User();
		p.setPassword("1230");
		p.setUsername("hello");

		User p2 = new User();
		p2.setPassword("baby");
		p2.setUsername("hello123");

		List<User> list = new ArrayList<User>();
		list.add(p);
		list.add(p2);
		System.out.println(123456);
		System.out.println(123456);
		System.out.println(123456);
		return p;
	}
}
