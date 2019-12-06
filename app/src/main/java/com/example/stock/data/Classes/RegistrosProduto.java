/**
 * Classe responsável por guardar produtos, utiliza do
 * padrão Singleton para se ter certeza de que se está mexendo
 * com o mesmo ArrayList em qualquer parte do sistema.
 *
 * @version 0.1.0
 * @Author Diego
 */

package com.example.stock.data.Classes;

import java.util.ArrayList;

public class RegistrosProduto implements Registros {

    /**
     * Lista para guardar produtos.
     */
    private ArrayList<Produto> produtos;

    /**
     * Atributo privado e estático para implentação do
     * padrão Singleton
     *
     * @version 0.1.0
     * @Author Diego
     */
    private static RegistrosProduto registrosProduto;

    /**
     * Construtor privado para que o atributo registrosProduto
     * só possa ser incializado dentro da classe, no caso,
     * no método getRegistrosProduto.
     *
     * @version 0.1.0
     * @Author Diego
     */
    private RegistrosProduto() {

        produtos = new ArrayList<Produto>();

        produtos.add(new Produto("produto1", "descricao1", 5.0f, 10.0f));
        produtos.add(new Produto("produto2", "descricao2", 3.0f, 5.0f));
    }

    /**
     * Verifica se o atributo registrosProduto já foi inicializado,
     * caso não, se inicializa o atributo.
     *
     * @return registrosProduto já incializado.
     * @version 0.1.0
     * @Author Diego
     */
    public static RegistrosProduto getRegistrosProduto() {

        if (registrosProduto == null) {

            registrosProduto = new RegistrosProduto();
        }

        return registrosProduto;
    }

    /**
     * Verifica se o produto tem está disponível
     *
     * @param o no caso será um produto
     * @return boolean
     * @version 0.1.0
     * @Author Diego
     */
    @Override
    public boolean checar(Object o) {

        Produto aux = (Produto) o;

        if (aux.getQtd() > 0)
            return true;

        return false;
    }

    /**
     * Adicona um produto na lista
     *
     * @param o produto
     * @return void
     * @version 0.1.0
     * @Author Diego
     */
    @Override
    public void addDado(Object o) {

        produtos.add((Produto) o);
    }

    /**
     * Retira uma produto da lista usando uma referência.
     *
     * @param o
     * @return void
     * @version 0.1.0
     * @Author Diego
     */
    @Override
    public void removerDado(Object o) {

        produtos.remove(o);
    }

    /**
     * Retira um produto da lista usando a posição dele
     *
     * @param index
     * @return void
     * @version 0.1.0
     * @Author Diego
     */
    @Override
    public void removerDado(int index) {

        produtos.remove(index);
    }

    /**
     * Pega um produto da lista usando a posição dele
     *
     * @param index
     * @return o produto
     * @version 0.1.0
     * @Author Diego
     */
    @Override
    public Object getDado(int index) {

        if (index > produtos.size())
            return null;

        return produtos.get(index);
    }

    public ArrayList getDados() {

        return this.produtos;
    }
}
