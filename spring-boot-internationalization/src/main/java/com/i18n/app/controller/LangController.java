package com.i18n.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LangController {
	@GetMapping("/")
	public String view() {
		return "index";
	}
}