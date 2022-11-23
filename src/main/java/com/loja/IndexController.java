package com.loja;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.loja.model.Categoria;

@Controller
public class IndexController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/")
	public String index() {

		return "/index";
	}
	
}
