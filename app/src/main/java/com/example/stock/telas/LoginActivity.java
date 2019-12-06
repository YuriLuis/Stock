package com.example.stock.telas;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.stock.R;
import com.example.stock.telas.TelaPrincipal;
import com.example.stock.data.Classes.Login;
import com.example.stock.data.Classes.RegistrosVendedor;
import com.google.android.material.snackbar.Snackbar;

/**
 * Tela de login que chama os metodos ue fazem as verificaçoes nescessarias.
 * Splash Screen
 *
 * @autor Felipe M Sant"ana, felipe.santana@hbsis.com.br
 */

public class LoginActivity extends AppCompatActivity {

    //Atributos da classe

    TextView senha, nome;
    Button entrar;
    RegistrosVendedor rv;
    Login login;
    RelativeLayout rellay1;

    /**
     * Criacao da classe Handler
     * Handler serve para agendar as tarefas postergadas da classe ou do aplicativo inteiro e
     * chama em post[Tarefa] ou postDelayed[] conforme a necessidade.
     * Estes metodos aceitam objetos Runnable.
     * A Runnable e uma interface deve ser implementada por qualquer
     * classe cujas instâncias sejam executadas por um encadeamento.
     * A classe deve definir um método sem argumentos chamados run.
     */
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {

        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        /* Tarefa para rodar no contexto principal da thread principal
          bloqueando  ate que a tarefa termine
        * postDelayed[tarefa] entra na fila de execuçao, tarefa fica agendada.
        */
        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);
        handler.postDelayed(runnable, 2000); // Timeout da splash

        senha = findViewById(R.id.loginTvSenha);
        nome = findViewById(R.id.loginTvUser);
        entrar = findViewById(R.id.loginEntrarBtn);
        rv = RegistrosVendedor.getRegistrosVendedor();
        login = new Login();

        entrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Metodo para pegar as informaçoes digitadas no campo nome e senha e trans em string
                String nomeVendedor = String.valueOf(nome.getText());
                String senhaVendedor = String.valueOf(senha.getText());


                //Verificar retorna a posiçao do venddedor na Lista dentro do registros vendedor
                int index = login.verificar(nomeVendedor, senhaVendedor);


                //Se senha e nome errados retorna -1
                if (index != -1) {

                    Intent intent = new Intent(v.getContext(), TelaPrincipal.class);
                    intent.putExtra("index", index);
                    startActivity(intent);

                } else {
                    Snackbar.make(v, "Verifique suas informações! ", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }

            }


        });

    }


}
