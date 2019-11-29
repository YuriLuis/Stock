package com.example.stock.data.Classes;

import java.util.ArrayList;

public class Login {

    private boolean podeEntrar;
    private RegistrosVendedor registrosVendedor;

    public Login(){

        registrosVendedor = RegistrosVendedor.getRegistrosVendedor();
    }

    public int verificar(String nome, String senha){

        ArrayList<Vendedor> auxVendedores = registrosVendedor.getVendedores();
        Vendedor v;

        for (int i = 0; i <= auxVendedores.size(); i++){

            v = auxVendedores.get(i);

            if (v.getNome().equalsIgnoreCase(nome) &&
                    v.getSenha().equals(senha))

                return i;

        }

        return -1;
    }

}
