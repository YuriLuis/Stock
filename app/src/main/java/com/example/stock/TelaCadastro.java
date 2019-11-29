package com.example.stock;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class TelaCadastro extends AppCompatActivity {

    AlertDialog alerta;
    AlertDialog alerta2;
    Button btnCadastrar;
    EditText txtProduto, txtPrice, txtQtd, txtDesc;


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

    private void alerta() {
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
        //define o titulo
        builder2.setTitle("StockSys");
        //define a mensagem
        builder2.setMessage("\n » Dados inválidos!");
        //cria o AlertDialog
        alerta2 = builder2.create();
        //Exibe
        alerta2.show();
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

        txtProduto = findViewById(R.id.txtProduto);
        txtPrice = findViewById(R.id.txtPrice);
        txtDesc = findViewById(R.id.txtDesc);
        txtQtd = findViewById(R.id.txtQtd);


        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if         ((String.valueOf(txtProduto.getText()).length() > 0 )
                        && (String.valueOf(txtPrice.getText()).length() > 0 )
                        && (String.valueOf(txtDesc.getText()).length() > 0 )
                        && (String.valueOf(txtQtd.getText()).length() > 0 ))
                {
                    btnCadastrar.setActivated(true);
                    alert();
                } else {
                    alerta();
                }

                txtProduto.setText("");
                txtPrice.setText("");
                txtDesc.setText("");
                txtQtd.setText("");
            }
        });



    }


}
