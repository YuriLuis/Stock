package com.example.stock.data.Classes;

import java.util.ArrayList;

public class RegistrosProduto implements Registros {

   private ArrayList<Produto> produtos;
   private static RegistrosProduto registrosProduto;

   private RegistrosProduto(){

       produtos = new ArrayList<Produto>();

       produtos.add(new Produto("produto1", "descricao1", 5.0f, 10.0f));
       produtos.add(new Produto("produto2", "descricao2", 3.0f, 5.0f));
   }

   public static RegistrosProduto getRegistrosProduto(){

       if (registrosProduto == null) {

           registrosProduto = new RegistrosProduto();
       }

       return registrosProduto;
   }

    @Override
    public boolean checar(Object o) {

       Produto aux = (Produto) o;

        if (aux.getQtd() > 0)
            return true;

        return false;
    }

    @Override
    public void addDado(Object o) {

        produtos.add((Produto) o);
    }

    @Override
    public void removerDado(Object o) {

       produtos.remove(o);
    }

    @Override
    public void removerDado(int index) {

       produtos.remove(index);
    }

    @Override
    public Object getDado(int index) {

        if (index > produtos.size())
            return null;

        return produtos.get(index);
    }
}
