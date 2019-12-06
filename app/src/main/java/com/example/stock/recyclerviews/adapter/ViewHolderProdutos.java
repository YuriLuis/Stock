package com.example.stock.recyclerviews.adapter;

import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.stock.R;

/**
 * Um ViewHolder descreve uma exibição de item e metadados sobre seu local no RecyclerView.
 *
 * RecyclerView.Adapteras implementações devem subclassificar o ViewHolder e adicionar campos
 * para armazenar em cache findViewById(int)resultados potencialmente caros .
 *
 * Enquanto RecyclerView.LayoutParamspertencem ao RecyclerView.LayoutManager,
 * ViewHolderspertencem ao adaptador.
 *
 * Os adaptadores devem ficar à vontade para usar suas próprias implementações personalizadas
 * do ViewHolder para armazenar dados que facilitam o conteúdo da visualização de ligação.
 *
 * As implementações devem assumir que as visualizações de itens individuais manterão
 * referências fortes a ViewHolderobjetos e que as RecyclerViewinstâncias poderão manter
 * referências fortes a visualizações de itens extras fora da tela para fins de cache*/
public class ViewHolderProdutos extends RecyclerView.ViewHolder {

        final TextView nomeProduto;
        final TextView quantidade;
        final TextView descricao;
        final TextView preco;

        /**
         * Construtor que seta as informações da classe
         *
         * Os parametros são os mesmo que estão no layoyt para captar
         * os dados do usuario para armazenamento.*/
        public ViewHolderProdutos(android.view.View itemView) {
            super(itemView);

            nomeProduto = itemView.findViewById(R.id.tvNomeProduto);
            quantidade = itemView.findViewById(R.id.tvQuantidade);
            descricao = itemView.findViewById(R.id.tvDescricao);
            preco = itemView.findViewById(R.id.tvPreco);

        }


}
