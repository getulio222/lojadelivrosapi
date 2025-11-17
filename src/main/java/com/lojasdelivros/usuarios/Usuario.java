package com.lojasdelivros.usuarios;

import java.time.LocalDate;
import java.util.List;

import com.lojasdelivros.entity.livros.Livro;
import com.lojasdelivros.enums.Genero;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private int idade;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 20)
	private Genero genero;

	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDate dataAniverssarioDate;

	@Column(nullable = false, unique = true)
	private String nomeUsuario;

	@Column(nullable = false)
	private String senha;

	@Column(nullable = false, unique = true, length = 100)
	private String email;
	
	@OneToMany(mappedBy = "usuarios",fetch = FetchType.LAZY)
	private List<Livro> livros;

}
