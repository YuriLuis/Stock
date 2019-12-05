package com.example.stock.recyclerviews.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stock.R;
import com.example.stock.data.Classes.Produto;

import java.util.ArrayList;

public class AdapterProdutos extends RecyclerView.Adapter {

    private ArrayList<Produto> produtos;
    private Context context;

    public AdapterProdutos(ArrayList<Produto> produtos, Context context){

        this.produtos = produtos;
        this.context = this.context;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista
                , parent, false);

        ViewHolderProdutos vhp = new ViewHolderProdutos(view);

        return vhp;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Produto p = produtos.get(position);
        ViewHolderProdutos ca = (ViewHolderProdutos) holder;

        ca.nomeProduto.setText(p.getNome());
        ca.quantidade.setText(String.valueOf(p.getQtd()));
        ca.descricao.setText(p.getDescricao());
        ca.preco.setText(String.valueOf(p.getPreco()));
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

}
