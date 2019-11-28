package com.example.stock;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class TelaCadastro extends AppCompatActivity {

    AlertDialog alerta;
    Button btnCadastrar;

    private void alert() {
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define o titulo
        builder.setTitle("StockSys");
        //define a mensagem
        builder.setMessage("\n » Produto cadastrado!");
        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        setTitle("Cadastrar produto");
        btnCadastrar =  findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                alert();
            }

        });


    }


}
