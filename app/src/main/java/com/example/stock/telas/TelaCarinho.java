package com.example.stock.telas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.stock.R;
import com.example.stock.data.Classes.RegistrosProduto;
import com.example.stock.recyclerviews.adapter.AdapterProdutos;
import com.google.android.material.navigation.NavigationView;

public class TelaCarinho extends AppCompatActivity {

    private RecyclerView rv;
    private RegistrosProduto rp;
    private AdapterProdutos adapterProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_carinho);

        rv = (RecyclerView) findViewById(R.id.recyclerViewCarrinho);

        rp = RegistrosProduto.getRegistrosProduto();

        adapterProdutos = new AdapterProdutos(rp.getDados(), this);
        rv.setAdapter(adapterProdutos);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

}
