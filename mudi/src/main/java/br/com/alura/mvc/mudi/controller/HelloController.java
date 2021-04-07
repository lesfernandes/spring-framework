package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	/**
	 * o método hello é um action 
	 * o retorno da action é o nome da view que será renderizada
	 */
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "World");
		return "hello";
	}
}
