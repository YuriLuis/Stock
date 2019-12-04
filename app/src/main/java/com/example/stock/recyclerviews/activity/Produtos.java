package com.example.stock.recyclerviews.activity;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stock.R;
import com.example.stock.data.Classes.RegistrosProduto;
import com.example.stock.recyclerviews.adapter.Adapter;

import java.util.ArrayList;
import java.util.List;

public class Produtos extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<RegistrosProduto> produtos = new ArrayList<RegistrosProduto>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        recyclerView = findViewById(R.id.recycleView);

        //Cria Lista Produtos
        this.carregaArrayProdutos();

        //Configurar Adapter
        Adapter adapter = new Adapter(this.produtos);

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager =  new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

    }

    public void carregaArrayProdutos(){
        this.produtos = (List<RegistrosProduto>) RegistrosProduto.getRegistrosProduto();
    }
}
