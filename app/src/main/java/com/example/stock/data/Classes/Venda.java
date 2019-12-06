
/**
 * A classe será responsável por fazer operações relacionas a venda.
 *
 * @version 0.1.0
 * @Author Diego
 */

package com.example.stock.data.Classes;

import java.util.ArrayList;

public class Venda {

    private Vendedor v;
    private ArrayList<Item> carrinho;
    private float precoTotalVenda;

    /**
     O objetivo ao passar um arrayList<Item> como parâmetro
     é já instanciar a venda com todos os items que ela terá.
     Já ao chamar o método atualizarEstoque(), como já se
     saberá todos os items da venda, o estoque será atualizado
     de uma vez só, e apenas uma vez, assim evitando possíveis
     erros de lógica.

     @param v responsável pela venda
     @param carrinho lista dos items

     @version 0.1.0
     @Author Diego
     */
    public Venda(Vendedor v, ArrayList<Item> carrinho) {

        this.v = v;
        this.carrinho = carrinho;

        atualizarEstoque();
    }

    public Venda() {

    }

    /**
     Método responsável por atualizar as quantidades
     de cada produto no estoque. É chamado no construtor.

     Foi colocado no construtor para que o estoque seja atualizado
     somente se a venda for confirmada. Tem acesso privado para
     maior controle.

     @return void

     @version 0.1.0
     @Author: Diego
     */

    private void atualizarEstoque() {

        for (Item i : carrinho) {

            i.retirarDoEstoque();
        }
    }

    /**
     Adiciona um item ao carrinho usando referência.

     @param i
     @return void

     @version 0.1.0
     @Author Diego
     */
    public void addItem(Item i) {

        carrinho.add(i);
    }

    /**
     Remove um item do carrinho usando referência.

     @param Item
     @return void

     @version 0.1.0
     @Author Diego
     */

    public void removerItem(Item i) {

        carrinho.remove(i);
    }

    /**
     Remove um item do carrinho usando sua posição.

     @param index do item a ser removido
     @return void

     @version 0.1.0
     @Author Diego
     */
    public void removerItem(int index) {

        carrinho.remove(index);
    }

    /**
     Pega um item usando sua posição.

     @param index do item que se deseja obter
     @return Item

     @version 0.1.0
     @Author Diego
     */
    public Item getItem(int index) {

        return carrinho.get(index);
    }


    /**
     Pega o atributo vendedor da classe vendedor

     @return Vendedor
     @version 0.1.0
     @Author Diego
     */
    public Vendedor getV() {
        return v;
    }

    /**
     @return ArrayList<carrinho> lista de produtos

     @version 0.1.0
     @Author Diego
     */
    public ArrayList<Item> getCarrinho() {
        return carrinho;
    }

    /**

     @return float retorna o preço total da venda.

     @version 0.1.0
     @Author Diego
     */
    public float getPrecoTotalVenda() {
        return precoTotalVenda;
    }

}
