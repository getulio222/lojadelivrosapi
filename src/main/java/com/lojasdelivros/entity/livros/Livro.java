package com.lojasdelivros.entity.livros;

import com.lojasdelivros.entity.autores.Autor;
import com.lojasdelivros.entity.editoras.Editora;
import com.lojasdelivros.usuarios.Usuario;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Livro { //Entidade Principal(Pai) que vai se relacionar com as demais. 1 para N
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(nullable = false)
	private String isbn;
	
	@Column(columnDefinition = "integer default 0")
	private int paginas;
	
	@Column(columnDefinition = "integer default 0")
	private int capitulos;	
	
	@ManyToOne(cascade = {CascadeType.MERGE})
	private Autor autor;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private Editora editoras;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private Usuario usuarios; 
	
}
