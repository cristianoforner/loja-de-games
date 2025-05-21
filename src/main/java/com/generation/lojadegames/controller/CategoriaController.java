package com.generation.lojadegames.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.generation.lojadegames.model.Categoria;
import com.generation.lojadegames.repository.CategoriaRepository;

import jakarta.validation.Valid;

@RestController // Define a classe como Controller REST
@RequestMapping("/categorias") // Define a rota base da API
@CrossOrigin(origins = "*", allowedHeaders = "*") // Permite requisições de qualquer origem
public class CategoriaController {

    @Autowired // Injeta a dependência do repositório
    private CategoriaRepository categoriaRepository;

    @GetMapping // GET /categorias
    public ResponseEntity<List<Categoria>> getAll() {
        return ResponseEntity.ok(categoriaRepository.findAll());
    }

    @GetMapping("/{id}") // GET /categorias/{id}
    public ResponseEntity<Categoria> getById(@PathVariable Long id) {
        return categoriaRepository.findById(id)
                .map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/tipo/{tipo}") // GET /categorias/tipo/{tipo}
    public ResponseEntity<List<Categoria>> getByTipo(@PathVariable String tipo) {
        return ResponseEntity.ok(categoriaRepository.findAllByTipoContainingIgnoreCase(tipo));
    }

    @PostMapping // POST /categorias
    public ResponseEntity<Categoria> post(@Valid @RequestBody Categoria categoria) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
    }

    @PutMapping // PUT /categorias
    public ResponseEntity<Categoria> put(@Valid @RequestBody Categoria categoria) {
        return ResponseEntity.ok(categoriaRepository.save(categoria));
    }

    @DeleteMapping("/{id}") // DELETE /categorias/{id}
    public void delete(@PathVariable Long id) {
        categoriaRepository.deleteById(id);
    }
}
