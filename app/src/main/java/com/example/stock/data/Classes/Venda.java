package com.example.stock.data.Classes;

import java.util.ArrayList;

public class Venda {

    private Vendedor v;
    private ArrayList<Item> carrinho;
    private float precoTotalVenda;

    public Venda(Vendedor v, ArrayList<Item> carrinho){

        this.v = v;
        this.carrinho = carrinho;

        atualizarEstoque();
    }

    public Venda(){

    }

    private void atualizarEstoque(){

        for (Item i: carrinho) {

            i.retirarDoEstoque();
        }
    }

    public void addItem(Item i){

        carrinho.add(i);
    }

    public void removerItem(Item i){

        carrinho.remove(i);
    }

    public void removerItem(int index){

        carrinho.remove(index);
    }

    public Item getItem(int index){

        return carrinho.get(index);
    }

    public Vendedor getV() {
        return v;
    }

    public ArrayList<Item> getCarrinho() {
        return carrinho;
    }

    public float getPrecoTotalVenda() {
        return precoTotalVenda;
    }

}
