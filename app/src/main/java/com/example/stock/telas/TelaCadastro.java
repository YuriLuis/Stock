/**
 @author: Leandro Schepers Compolt <leandro.compolt@hbsis.com.br>
 @author: Yuri Martins <yuri.pereira@hbsis.com.br>
 */

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

    /**
     * Criando os atributos da classe
     */

    AlertDialog alerta;
    AlertDialog alerta2;
    Button btnCadastrar;
    EditText txtProduto, txtPrice, txtQtd, txtDesc;
    RegistrosProduto rp;
    Produto produto;


    /**
     * Aqui estamos criando um alerta, através de um método, que pde ser chamado a qualquer momento
     * Temos o alert que é 'Produto cadastrado'
     * E temos o alerta que é 'Dados inválidos'
     */


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

    /**
     * Setando o layout parecido com o da tela login
     * Setando o titulo da tela para Cadastrar produto
     * Transformando as views em objetos
     * Fazendo a verificação se já texto no campos
     * Fazendo o cadastro dos produtos
     * Limpando os campos, após inserção
     */

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
                    rp.addDado(cadastrarProduto());
                    alert();
                } else {
                    alerta();
                }
                limpaCampos();
            }
        });



    }

    /**
     * Método que limpa os campos após o cadastro.
     */

    public void limpaCampos(){

        txtProduto.setText("");
        txtPrice.setText("");
        txtDesc.setText("");
        txtQtd.setText("");
    }

    /**
     * Criando as variaveis que armazenam os dados e convertem para seu tipo primitivo.
     * Criando um novo produto com as caracteristicas.
     * O método retorna um produto.
     */

    public Produto cadastrarProduto(){

        String nomeProduto = String.valueOf(txtProduto.getText());
        Float precoProduto = Float.valueOf(String.valueOf(txtPrice.getText()));
        Float quantidade = Float.valueOf(String.valueOf(txtQtd.getText()));
        String descricao = String.valueOf(txtDesc.getText());


        produto = new Produto(nomeProduto,descricao,precoProduto,quantidade);


        return produto;
    }
}
