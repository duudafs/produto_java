package com.efs.produto.entity;

import com.efs.produto.enums.StatusProduto;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double preco;

    private Integer quantidadeEmEstoque;

    @Enumerated(EnumType.STRING)
    private StatusProduto status;

    public Produto() {}

    public Produto(String nome, Double preco, Integer quantidadeEmEstoque, StatusProduto status) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public Integer getQuantidadeEmEstoque() { return quantidadeEmEstoque; }
    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public StatusProduto getStatus() { return status; }
    public void setStatus(StatusProduto status) { this.status = status; }
}
