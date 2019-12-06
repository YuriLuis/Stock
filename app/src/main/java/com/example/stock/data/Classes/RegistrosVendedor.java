/*
    Classe responsável por guardar vendedores, utiliza do
    padrão Singleton para se ter certeza de que se está mexendo
    com o mesmo ArrayList em qualquer parte do sistema.

    @version 0.1.0
    @Author Diego
     */


package com.example.stock.data.Classes;

import java.util.ArrayList;

public class RegistrosVendedor implements Registros {

    //Lista para guardar vendedores.
    private ArrayList<Vendedor> vendedores;

    /*
    Atributo privado e estático para implentação do
    padrão Singleton

    @version 0.1.0
    @Author Diego
     */
    private static RegistrosVendedor registrosVendedor;

    /*
    Construtor privado para que o atributo registrosVendedor
    só possa ser incializado dentro da classe, no caso,
    no método getRegistrosVendedor.

    @version 0.1.0
    @Author Diego
     */
    private RegistrosVendedor(){

        vendedores = new ArrayList<Vendedor>();

        vendedores.add(new Vendedor("", ""));
    }

    /*
    Verifica se o atributo registrosVendedor já foi inicializado,
    caso não, se inicializa o atributo.

    @return registrosProduto já incializado.

    @version 0.1.0
    @Author Diego
     */
    public static RegistrosVendedor getRegistrosVendedor() {

        if (registrosVendedor == null)
            registrosVendedor = new RegistrosVendedor();

        return registrosVendedor;
    }

    /*
     Verifica se o vendedor existe disponível

     @param o no caso será um vendedor
     @return boolean

     @version 0.1.0
     @Author Diego
      */
    @Override
    public boolean checar(Object o) {

        return vendedores.contains(o);
    }

    /*
    Adicona um vendedor na lista

    @param o vendedor
    @return void

    @version 0.1.0
    @Author Diego
     */
    @Override
    public void addDado(Object o) {

        vendedores.add((Vendedor) o);
    }

    /*
    Retira uma vendedor da lista usando uma referência.

    @param o
    @return void

    @version 0.1.0
    @Author Diego
     */
    @Override
    public void removerDado(Object o) {

        vendedores.remove(o);
    }

    /*
    Retira um vendedor da lista usando a posição dele.

    @param index
    @return void

    @version 0.1.0
    @Author Diego
     */
    @Override
    public void removerDado(int index) {

        vendedores.remove(index);
    }

    /*
    Pega um vendedor da lista usando a posição dele

    @param index
    @return o vendedor

    @version 0.1.0
    @Author Diego
     */
    @Override
    public Object getDado(int index) {

        if (index > vendedores.size())
            return null;

        return vendedores.get(index);
    }


    public ArrayList<Vendedor> getVendedores(){

        return vendedores;
    }
}
