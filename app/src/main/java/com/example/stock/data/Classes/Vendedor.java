/**
 * Representação de um vendedor no sistema,
 * será utilizado para guardar informações de login.
 */

package com.example.stock.data.Classes;

public class Vendedor {

    private String nome, senha;

    public Vendedor(String nome, String senha) {

        this.nome = nome;
        this.senha = senha;
    }

    public Vendedor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
