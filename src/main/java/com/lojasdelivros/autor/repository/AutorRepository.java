package com.lojasdelivros.autor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojasdelivros.autor.entity.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{

}
