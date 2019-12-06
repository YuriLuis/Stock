package com.example.stock.data.Classes;
/*
    Representação de um produto. O atributo qtd é a
    quantidade disponível para uso.

    @version 0.1.0
    @Author Diego
     */

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
    /*
    Este método diminui a quantidade dispoível do produto.
    Será chamado na classe Item.

    @param qtd
    @return void

    @version 0.1.0
    @Author Diego
     */
    public void diminuirQtd(float qtd) {

        this.qtd -= qtd;
    }

    /*
    Este método aumenta a quantia disponível do produto.

    @param qtd
    @return void

    @version 0.1.0
    @Author Diego
     */
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
