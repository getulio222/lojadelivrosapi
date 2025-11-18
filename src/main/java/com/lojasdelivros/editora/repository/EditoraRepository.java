package com.lojasdelivros.editora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojasdelivros.editora.entity.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long> {

}
