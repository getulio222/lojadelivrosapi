package com.lojasdelivros.livro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroController {
	
	@GetMapping
	public String livros(){
		return "Teste do metodo GET de livros OK! ";
		
	}

}
