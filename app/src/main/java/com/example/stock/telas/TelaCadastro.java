package com.example.stock.telas;

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

import com.example.stock.R;
import com.example.stock.data.Classes.Produto;
import com.example.stock.data.Classes.RegistrosProduto;

public class TelaCadastro extends AppCompatActivity {

    AlertDialog alerta;
    AlertDialog alerta2;
    Button btnCadastrar;
    EditText txtProduto, txtPrice, txtQtd, txtDesc;
    RegistrosProduto rp;
    Produto produto;


    private void alert() {
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define o titulo
        builder.setTitle("StockSys");
        //define a mensagem
        builder.setMessage("\n » Produto cadastrado!");

        rp.addDado(cadastrarProduto());

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
        setTitle("Cadastrar produto");    // Setando o título
        btnCadastrar =  findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                alert();
            }

        });

        txtProduto = findViewById(R.id.txtProduto);  //Instanciando o editText
        txtPrice = findViewById(R.id.txtPrice);  //Instanciando o editText
        txtDesc = findViewById(R.id.txtDesc);  //Instanciando o editText
        txtQtd = findViewById(R.id.txtQtd);  //Instanciando o editText

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if         ((String.valueOf(txtProduto.getText()).length() > 0 )   // Verificando se o campo tem algo digitado
                        && (String.valueOf(txtPrice.getText()).length() > 0 )   // Verificando se o campo tem algo digitado
                        && (String.valueOf(txtDesc.getText()).length() > 0 )   // Verificando se o campo tem algo digitado
                        && (String.valueOf(txtQtd.getText()).length() > 0 ))   // Verificando se o campo tem algo digitado
                {
                    btnCadastrar.setActivated(true); // Ativando o botão caso tenha texto dentro.
                    alert();
                } else {
                    alerta();
                }
                    limpaCampos();
            }
        });



    }

    public void limpaCampos(){ // Função que liga os campos após a inserção de dados

        txtProduto.setText("");
        txtPrice.setText("");
        txtDesc.setText("");
        txtQtd.setText("");
    }

    public Produto cadastrarProduto(){

        String nomeProduto = String.valueOf(txtProduto.getText());
        String precoProdutoString = String.valueOf(txtPrice.getText());
        String quantidadeSttring = String.valueOf(txtQtd.getText());
        String descricao = String.valueOf(txtDesc.getText());

        Float precoProduto = Float.valueOf(precoProdutoString);
        Float quantidade = Float.valueOf(quantidadeSttring);

        produto = new Produto(nomeProduto,descricao,precoProduto,quantidade);


        return produto;
    }
}
