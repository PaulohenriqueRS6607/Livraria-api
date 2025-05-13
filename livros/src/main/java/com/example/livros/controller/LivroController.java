package com.example.livros.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.livros.dto.LivroDTO;
import com.example.livros.service.LivroService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/livros")
@Tag(name = "Livros", description = "Operações relacionadas aos livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @Operation(summary = "Cria um novo livro")
    @PostMapping
    public LivroDTO criarLivro(@RequestBody LivroDTO livroDTO) {
        return livroService.criarLivro(livroDTO);
    }

    @Operation(summary = "Lista todos os livros")
    @GetMapping
    public List<LivroDTO> listarLivros() {
        return livroService.listarLivros();
    }

    @Operation(summary = "Busca um livro por ID")
    @GetMapping("/{id}")
    public ResponseEntity<LivroDTO> buscarLivroPorId(@PathVariable Long id) {
        Optional<LivroDTO> livroDTO = livroService.buscarLivroPorId(id);
        return livroDTO.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Operation(summary = "Atualiza um livro por ID")
    @PutMapping("/{id}")
    public ResponseEntity<LivroDTO> atualizarLivro(@PathVariable Long id, @RequestBody LivroDTO livroDTO) {
        LivroDTO updatedLivroDTO = livroService.atualizarLivro(id, livroDTO);
        if (updatedLivroDTO != null) {
            return ResponseEntity.ok(updatedLivroDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @Operation(summary = "Deleta um livro por ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarLivro(@PathVariable Long id) {
        livroService.deletarLivro(id);
        return ResponseEntity.noContent().build();
    }
}
