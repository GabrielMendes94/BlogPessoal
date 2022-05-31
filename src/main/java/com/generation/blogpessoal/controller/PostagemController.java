package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

//indica que a classe é uma classe controladora da api (onde ficam os endpoints)
@RestController

//permite que requisições de outras portas sejam aceitas na minha aplicação
@CrossOrigin("*")

//cria um endpoint
@RequestMapping("/postagens")
public class PostagemController {
	
	//transfe a responsabilidade para a injeção de dependência
	//funciona como injecao de dependencia, transferindo a responsabilidade de manipular o banco de dados para o PostagemRepository
	@Autowired
	private PostagemRepository repository;
	
	//indica o verbo que pode ser utilizado no endpoint
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
}
