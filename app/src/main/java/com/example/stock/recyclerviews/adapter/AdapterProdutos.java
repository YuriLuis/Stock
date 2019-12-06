package com.example.stock.recyclerviews.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.stock.R;
import com.example.stock.data.Classes.Produto;

import java.util.ArrayList;
/**A Classe Adapter produto
 * faz a parte de adaptação para gerar o recycler view na activity
 * Essa classe é chamada na tela principal no metodo onStart linha 72 (TelaPrincipal)
 *e no setApapter tem que setar a classe para iniciar a adapdaçao para o recylerview
 * linha 76 (TelaPrincipal)
 * Também tem o atributo da classe na (TelaPrincipal) para uso do AdapterProdutos.
 * **/
public class AdapterProdutos extends RecyclerView.Adapter {

    private ArrayList<Produto> produtos;
    private Context context;

    public AdapterProdutos(ArrayList<Produto> produtos, Context context){

        this.produtos = produtos;
        this.context = this.context;
    }


    /**
    * Chamado quando o RecyclerView precisa de um novo RecyclerView.ViewHolderdo
    * tipo especificado para representar um item.
    *
    * Esse novo ViewHolder deve ser construído com uma nova exibição que
    * possa representar os itens do tipo especificado.
    *
    * Você pode criar uma nova exibição
    * manualmente ou inflá-la a partir de um arquivo de layout XML.
    *
    * O novo ViewHolder será usado para exibir itens do adaptador
    * usando onBindViewHolder(ViewHolder, int, List).
    *
    * Como será reutilizado para exibir itens diferentes no conjunto de dados,
    *  é uma boa idéia armazenar em cache as referências às sub-visualizações da
    * Visualização para evitar findViewById(int)chamadas desnecessárias .
     * */
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista
                , parent, false);

        ViewHolderProdutos vhp = new ViewHolderProdutos(view);

        return vhp;
    }

    /**
     *
     * Atualiza o conteúdo do itemView para o indice especificado.
     *
    * Chamado pelo RecyclerView para exibir os dados na posição especificada.
    * Este método deve atualizar o conteúdo do itemViewpara refletir o item
    * na posição especificada.
    *
    * Observe que ListView, diferentemente , o RecyclerView não chamará esse
    * método novamente se a posição o item for alterada no conjunto de dados,
    * a menos que o próprio item seja invalidado ou a nova posição não
    * possa ser determinada. Por esse motivo, você deve usar o position
     * parâmetro apenas ao adquirir o item de dados relacionado dentro deste
     *método e não deve manter uma cópia dele. Se você precisar da posição de
     *um item posteriormente (por exemplo, em um ouvinte de clique)
     *, use getAdapterPosition()qual terá a posição atualizada do adaptador.
     * Substitua onBindViewHolder(ViewHolder, int, List)se o Adapter puder manipular
     * uma ligação parcial eficiente.
     *
     * Parametros:
     * (ViewHolder holder)
     * Um ViewHolder descreve uma exibição de item e metadados sobre seu local no RecyclerView.
     *
     * (int position)
     * É para saber a posição do recycler view.
     * */
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Produto p = produtos.get(position);
        ViewHolderProdutos ca = (ViewHolderProdutos) holder;

        ca.nomeProduto.setText(p.getNome());
        ca.quantidade.setText(String.valueOf(p.getQtd()));
        ca.descricao.setText(p.getDescricao());
        ca.preco.setText(String.valueOf(p.getPreco()));
    }

    /**
     * Retorna o número total de itens no conjunto de dados retidos pelo adaptador.*/
    @Override
    public int getItemCount() {
        return produtos.size();
    }

}
