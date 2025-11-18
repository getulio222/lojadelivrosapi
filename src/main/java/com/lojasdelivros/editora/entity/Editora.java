package com.lojasdelivros.editora.entity;

import java.time.LocalDate;
import java.util.List;

import com.lojasdelivros.entity.Auditoria;
import com.lojasdelivros.livro.entity.Livro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Editora extends Auditoria{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false, unique = true)
private String nome;

@Column(nullable = false, unique = true, length = 100)
private Long code;

@Column(nullable = false, columnDefinition = "TIMESTAMP")
private LocalDate dataLancamento;

@OneToMany(mappedBy = "editoras", fetch = FetchType.LAZY)
private List<Livro> livros;


}
