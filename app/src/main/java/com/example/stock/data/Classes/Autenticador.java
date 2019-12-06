package com.example.stock.data.Classes;

public class Autenticador {

    /** Metodo para verificar  se a string digitada no login
     * verifica se possui espaços vazios e o tamanho, se nao tem nada digitado
     */
    public static boolean verificaVazio(String str) {
        return str.equals("") ? true : false;
    }

    //Trim() serve para retirar espaços em branco de uma string.
    public static boolean verificaVazioOuBranco(String param) {

        return (verificaVazio(param) || param.trim().length() == 0);
    }

    public static boolean verificaTamanhoSenha(String tam ) {

        return (tam.length() > 6 || tam.length() < 12);
    }
}
