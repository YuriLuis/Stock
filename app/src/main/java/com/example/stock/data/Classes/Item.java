/*
    Classe criada para guarda referência a um produto,
    pegar uma quantia dele, calcular o preço total baseado
    no preço unitário do produto. Instâncias desta classe
    serão usadas na classe de Venda.

    @version 0.1.0
    @Author Diego
     */
package com.example.stock.data.Classes;

public class Item {

    private Produto p;
    private float qtd, precoTotalItem;

    /*
    Instância o item e já calcula o preço total

    @param p referência a um produto existente
    @param qtd quantidade do produto
    @return void

    @version 0.1.0
    @Author Diego
     */
    public Item(Produto p, float qtd) {

        this.p = p;
        this.qtd = qtd;

        setPrecoTotalItem();
    }

    public Item(){

    }

    /*
    @param qtd quantidade do produto desejado
    @return boolean true caso qtd seja menor ou igual
    ao disponível, e false caso não.

    @version 0.1.0
    @Author Diego
     */
    public boolean verificaQtdEstoque(float qtd){

        if (qtd  <= p.getQtd()){

            return true;
        }

        return false;
    }

    /*
    Usa o método da classe Produto para retirar uma quantia
    igual ao do atributo qtd.

    Será chamado na classe Venda.

    @return void

    @version 0.1.0
    @Author Diego
     */
    public void retirarDoEstoque(){

        p.diminuirQtd(qtd);
    }

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    public float getPrecoTotalItem() {
        return precoTotalItem;
    }

    public void setPrecoTotalItem() {

        this.precoTotalItem = qtd * p.getPreco();
    }
}
