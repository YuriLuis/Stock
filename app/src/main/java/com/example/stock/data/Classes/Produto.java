package com.example.stock.data.Classes;

public class Produto {

    private String nome, descricao;
    private float preco, qtd;

    public Produto(String nome, String descricao,
                   float preco, float qtd) {

        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.qtd = qtd;
    }

    public Produto() {

    }

    public void diminuirQtd(float qtd) {

        this.qtd -= qtd;
    }

    public void addQtd(int qtd) {

        this.qtd += qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getQtd() {
        return qtd;
    }

}
