package com.lojasdelivros.livro.entity;

import com.lojasdelivros.autor.entity.Autor;
import com.lojasdelivros.editora.entity.Editora;
import com.lojasdelivros.entity.Auditoria;
import com.lojasdelivros.usuario.entity.Usuario;

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
public class Livro extends Auditoria{ //Entidade Principal(Pai) que vai se relacionar com as demais. 1 para N
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
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
