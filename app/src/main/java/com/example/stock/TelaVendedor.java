package com.example.stock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class TelaVendedor extends AppCompatActivity {
    AlertDialog alerta;
    Button btnCadastra;
    EditText nomeVendedor;
    EditText senha;
    Toolbar tool;


    private void alert() {
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define o titulo
        builder.setTitle("StockSys");
        //define a mensagem
        builder.setMessage("\n » Vendedor salvo");
        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_vendedor);
        setTitle("Cadastrar vendedor");
        btnCadastra =  findViewById(R.id.btnSalvar);
        nomeVendedor = findViewById(R.id.edNome);
        senha = findViewById(R.id.etPassword);
        btnCadastra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                alert();
            }

        });

        nomeVendedor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                senha.setVisibility(View.GONE);
            }

        });

        senha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                btnCadastra.isClickable();
            }

        });


    }
}
