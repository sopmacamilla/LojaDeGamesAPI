package com.quemtemjoga.LojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quemtemjoga.LojaDeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByPlataformaContainingIgnoreCase (String plataforma);	
}
