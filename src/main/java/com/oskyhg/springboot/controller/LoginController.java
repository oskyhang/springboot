package com.oskyhg.springboot.controller;

import com.oskyhg.springboot.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping("/dologin")
	public Person getdemo() {
		Person p = new Person();
		p.setPassword("1230");
		p.setUsername("hello");

		Person p2 = new Person();
		p2.setPassword("baby");
		p2.setUsername("hello123");

		List<Person> list = new ArrayList<Person>();
		list.add(p);
		list.add(p2);
		System.out.println(123456);
		System.out.println(123456);
		System.out.println(123456);
		return p;
	}
}
