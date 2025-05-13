package com.example.livros.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.livros.dto.LivroDTO;
import com.example.livros.entities.Livro;
import com.example.livros.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    // DTO para Entidade
    private Livro toEntity(LivroDTO dto) {
        Livro livro = new Livro();
        livro.setId(dto.getId());
        livro.setTitulo(dto.getTitulo());
        livro.setAutor(dto.getAutor());
        livro.setGenero(dto.getGenero());
        livro.setCapa(dto.getCapa());
        livro.setDataPublicacao(dto.getDataPublicacao());
        livro.setDescricao(dto.getDescricao());
        livro.setPreco(dto.getPreco());
        livro.setCodBarrasNum(dto.getCodBarrasNum());
        return livro;
    }

    // Entidade para DTO
    private LivroDTO toDTO(Livro livro) {
        LivroDTO dto = new LivroDTO();
        dto.setId(livro.getId());
        dto.setTitulo(livro.getTitulo());
        dto.setAutor(livro.getAutor());
        dto.setGenero(livro.getGenero());
        dto.setCapa(livro.getCapa());
        dto.setDataPublicacao(livro.getDataPublicacao());
        dto.setDescricao(livro.getDescricao());
        dto.setPreco(livro.getPreco());
        dto.setCodBarrasNum(livro.getCodBarrasNum());
        return dto;
    }

    // Create
    public LivroDTO criarLivro(LivroDTO livroDTO) {
        Livro livro = toEntity(livroDTO);
        Livro savedLivro = livroRepository.save(livro);
        return toDTO(savedLivro);
    }

    // Read (todos)
    public List<LivroDTO> listarLivros() {
        return livroRepository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    // Read (por ID)
    public Optional<LivroDTO> buscarLivroPorId(Long id) {
        return livroRepository.findById(id).map(this::toDTO);
    }

    // Update
    public LivroDTO atualizarLivro(Long id, LivroDTO livroDTO) {
        Optional<Livro> livroExistente = livroRepository.findById(id);
        if (livroExistente.isPresent()) {
            Livro livro = livroExistente.get();
            livro.setTitulo(livroDTO.getTitulo());
            livro.setAutor(livroDTO.getAutor());
            livro.setGenero(livroDTO.getGenero());
            livro.setCapa(livroDTO.getCapa());
            livro.setDataPublicacao(livroDTO.getDataPublicacao());
            livro.setDescricao(livroDTO.getDescricao());
            livro.setPreco(livroDTO.getPreco());
            livro.setCodBarrasNum(livroDTO.getCodBarrasNum());
            Livro updatedLivro = livroRepository.save(livro);
            return toDTO(updatedLivro);
        }
        return null;
    }

    // Delete
    public void deletarLivro(Long id) {
        livroRepository.deleteById(id);
    }
}