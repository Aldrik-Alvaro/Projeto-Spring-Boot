package com.projetoapp.projeto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	
	//REDIRECIONA PARA PAGINA INDEX HTML
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
