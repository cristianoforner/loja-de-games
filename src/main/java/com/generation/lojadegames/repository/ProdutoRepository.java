package com.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.lojadegames.model.Produto;

// Interface que permite operações com o banco de dados para Produto
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // Consulta personalizada por nome (contendo parte do texto)
    public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

    // Consulta extra 1: produtos com preço maior que valor informado
    public List<Produto> findByPrecoGreaterThan(BigDecimal preco);

    // Consulta extra 2: produtos com preço menor que valor informado
    public List<Produto> findByPrecoLessThan(BigDecimal preco);
}
