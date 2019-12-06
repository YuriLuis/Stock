/*
    Classe responsável por verificar se as informações
    recebidas são compatíveis com o armazenado, e também,
    com o necessário para realizar o login.

    @version 0.1.0
    @Author Diego
     */

package com.example.stock.data.Classes;

import java.util.ArrayList;

public class Login {

    private boolean podeEntrar;
    private RegistrosVendedor registrosVendedor;

    public Login(){

        //Pega a única instância da classe no programa.
        registrosVendedor = RegistrosVendedor.getRegistrosVendedor();
    }

    /*
    Faz as verificações para permitir ou não o acesso ao resto do sistema.

    @param nome nome do vendedor
    @param senha senha do vendedor

    @return int retorna a posição do vendedor dentro da ArrayList na classe
    RegistrosVendedor para uma maior facilidade de acessar informações em
    diferentes activities. Retorna -1 caso os parâmetros não coincidam com
    as informações dentro do ArrayList de RegistrosVendedor.

    @version 0.1.0
    @Author Diego
     */
    public int verificar(String nome, String senha){

        ArrayList<Vendedor> auxVendedores = registrosVendedor.getVendedores();
        Vendedor v;

        for (int i = 0; i < auxVendedores.size(); i++){

            v = auxVendedores.get(i);

            if (v.getNome().equalsIgnoreCase(nome) &&
                    v.getSenha().equals(senha))

                return i;

        }

        return -1;
    }

}
