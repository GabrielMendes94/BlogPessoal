package com.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

//indica para o Spring que o objeto criado vai se tornar uma tabela
@Entity

// indica o nome dessa tabela
@Table(name="tb_postagem")
public class Postagem {
	
	//indica que o campo de id será uma chave primária
	@Id
	
	//equivale ao auto-increment do mysql
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull  //ou NotBlank
	private String titulo;
	
	private String texto;
	
	private Date data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy") //mostrar data no postman no padrão BR
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
