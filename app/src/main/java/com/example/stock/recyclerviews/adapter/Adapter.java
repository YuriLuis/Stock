package com.example.stock.recyclerviews.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.stock.R;
import com.example.stock.data.Classes.Produto;
import com.example.stock.data.Classes.RegistrosProduto;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<RegistrosProduto> listaProdutos;
    private Produto prod = new Produto();

    public Adapter(List<RegistrosProduto> lista) {
        this.listaProdutos = lista;
    }

    @Override
    public Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_produtos, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(Adapter.MyViewHolder holder, int position) {

        Produto produto = (Produto) RegistrosProduto.getRegistrosProduto().getDado(position);

        holder.nomeProduto.setText(produto.getNome());
        holder.quantidade.setText(String.valueOf(produto.getQtd()));
        holder.descricao.setText(produto.getDescricao());
        holder.preco.setText(String.valueOf(produto.getPreco()));
    }

    @Override
    public int getItemCount() {
        return listaProdutos.size();
    }


    public class MyViewHolder extends  RecyclerView.ViewHolder{

        TextView nomeProduto;
        TextView quantidade;
        TextView descricao;
        TextView preco;

        public MyViewHolder(View itemView) {
            super(itemView);

            nomeProduto = itemView.findViewById(R.id.tvNomeProduto);
            quantidade = itemView.findViewById(R.id.tvQuantidade);
            descricao = itemView.findViewById(R.id.tvDescricao);
            preco = itemView.findViewById(R.id.tvPreco);
        }
    }
}

