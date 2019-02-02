package com.example.Bookstore.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class BookstoreController {
	@RequestMapping("/index")
	public String greeting (@RequestParam("name") String name, 
			@RequestParam("age") int age, Model model) {
	model.addAttribute("name", name);
	model.addAttribute("age", age);
	return "hello";
	}
}
