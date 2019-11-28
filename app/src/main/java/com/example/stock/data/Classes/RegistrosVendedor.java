package com.example.stock.data.Classes;

import java.util.ArrayList;

public class RegistrosVendedor implements Registros {

    private ArrayList<Vendedor> vendedores;
    private static RegistrosVendedor registrosVendedor;

    private RegistrosVendedor(){

        vendedores = new ArrayList<Vendedor>();

        vendedores.add(new Vendedor("vendedor1", "senha1"));
    }

    public static RegistrosVendedor getRegistrosVendedor() {

        if (registrosVendedor == null)
            registrosVendedor = new RegistrosVendedor();

        return registrosVendedor;
    }

    @Override
    public boolean checar(Object o) {

        return vendedores.contains(o);
    }

    @Override
    public void addDado(Object o) {

        vendedores.add((Vendedor) o);
    }

    @Override
    public void removerDado(Object o) {

        vendedores.remove(o);
    }

    @Override
    public void removerDado(int index) {

        vendedores.remove(index);
    }

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
