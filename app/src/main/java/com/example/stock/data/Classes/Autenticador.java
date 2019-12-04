package com.example.stock.data.Classes;

public class Autenticador {

    public static boolean verificaVazio(String str) {
        return str.equals("") ? true : false;
    }

    public static boolean verificaVazioOuBranco(String param) {

        if (verificaVazio(param) || param.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean verificaTamanho(String tam ){

        if (tam.length() > 5 || tam.length() < 10  ){
            return  true;
        }
        return false;
    }

    public static boolean verificaTamanhoSenha(String tam ){

        if (tam.length() > 6 || tam.length() < 12 ){
            return  true;
        }
        return false;
    }

}
