package com.example.livros.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_livros")
public class Livro  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private String genero;
    private String capa;
    private LocalDateTime dataPublicacao;
    private String descricao;
    private Double preco;
    private Integer codBarrasNum;

    public Livro() {
    }

    public Livro(Long id, String titulo, String autor, String genero, String capa, LocalDateTime dataPublicacao, String descricao, Double preco, Integer codBarrasNum) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.capa = capa;
        this.dataPublicacao = dataPublicacao;
        this.descricao = descricao;
        this.preco = preco;
        this.codBarrasNum = codBarrasNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public LocalDateTime getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDateTime dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getCodBarrasNum() {
        return codBarrasNum;
    }

    public void setCodBarrasNum(Integer codBarrasNum) {
        this.codBarrasNum = codBarrasNum;
    }
}