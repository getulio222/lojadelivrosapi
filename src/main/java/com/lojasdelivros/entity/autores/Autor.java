package com.lojasdelivros.entity.autores;

import java.util.List;

import com.lojasdelivros.entity.auditorias.Auditoria;
import com.lojasdelivros.entity.livros.Livro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Autor extends Auditoria {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(nullable = false, unique = true)
private String nome;

@Column(columnDefinition = "integer default 0")
private int idade;

@OneToMany(mappedBy = "autor", fetch = FetchType.LAZY)
private List<Livro> livros;


	
}
