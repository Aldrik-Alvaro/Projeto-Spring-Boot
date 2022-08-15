package com.projetoapp.projeto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	//REDIRECIONA PARA PAGINA INDEX HTML
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
