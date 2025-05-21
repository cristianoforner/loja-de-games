package com.generation.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.lojadegames.model.Categoria;

// Interface que permite operações com o banco de dados para Categoria
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    // Consulta personalizada (ignora maiúsculas/minúsculas) por tipo
    public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
}
