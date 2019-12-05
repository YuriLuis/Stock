package com.example.stock.recyclerviews.adapter;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.stock.R;
import com.example.stock.telas.TelaProdutoInf;

public class ViewHolderProdutos extends RecyclerView.ViewHolder {

        final TextView nomeProduto;
        final TextView quantidade;
        final TextView descricao;
        final TextView preco;

        public ViewHolderProdutos(android.view.View itemView) {
            super(itemView);

            nomeProduto = itemView.findViewById(R.id.tvNomeProduto);
            quantidade = itemView.findViewById(R.id.tvQuantidade);
            descricao = itemView.findViewById(R.id.tvDescricao);
            preco = itemView.findViewById(R.id.tvPreco);

        }


}
