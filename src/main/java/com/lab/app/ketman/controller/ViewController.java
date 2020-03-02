package com.lab.app.ketman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lab.app.ketman.model.PostInputDto;

@Controller
public class ViewController {
	// show index html
	@RequestMapping("/move")
	public String showIndexHtml(Model model) {
		model.addAttribute("postInputDto", new PostInputDto());
		return "move";
	}
}
