package com.lojasdelivros.livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojasdelivros.livro.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
