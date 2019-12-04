package com.example.stock.telas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

import com.example.stock.R;
import com.example.stock.data.Classes.Autenticador;
import com.example.stock.data.Classes.RegistrosVendedor;
import com.example.stock.data.Classes.Vendedor;
import com.google.android.material.snackbar.Snackbar;

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

                String nomeVend = String.valueOf(nomeVendedor.getText()).trim();
                String senhaVend = String.valueOf(senha.getText()).trim();

                // Criando um novo vendedor
                Vendedor vendedor = new Vendedor((nomeVend),(senhaVend));

                RegistrosVendedor rv = RegistrosVendedor.getRegistrosVendedor();

                if (Autenticador.verificaVazio(nomeVend)
                        && Autenticador.verificaVazioOuBranco(nomeVend)
                        && Autenticador.verificaTamanho(nomeVend)) {

                }else{

                    Snackbar.make(nomeVendedor, "Digite um nome valido, min 5 caracteres  ",
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }

                if (Autenticador.verificaVazio(senhaVend)
                        && Autenticador.verificaVazioOuBranco(senhaVend)
                        && Autenticador.verificaTamanhoSenha(senhaVend) )
                       {

                }else {

                    Snackbar.make(nomeVendedor, "Digite uma senha valida, min 6 digitos   ",
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }

                rv.addDado(vendedor);
                nomeVendedor.setText("");
                senha.setText("");






            }

        });



    }
}
