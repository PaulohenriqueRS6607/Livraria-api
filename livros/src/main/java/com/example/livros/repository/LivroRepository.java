package com.example.livros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.livros.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}