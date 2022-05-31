package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

@Repository  //notação que define que PostagemRepository é um repositório de queries dentro da tabela de postagens
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	
}
