package com.example.stock.data.Classes;

public class Item {

    private Produto p;
    private float qtd, precoTotalItem;

    public Item(Produto p, float qtd) {

        this.p = p;
        this.qtd = qtd;

        setPrecoTotalItem();
    }

    public Item(){

    }

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
