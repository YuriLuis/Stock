package com.example.stock.ui.login;

import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.stock.R;
import com.example.stock.TelaPrincipal;
import com.example.stock.data.Classes.Login;
import com.example.stock.data.Classes.RegistrosVendedor;
import com.example.stock.ui.login.LoginViewModel;
import com.example.stock.ui.login.LoginViewModelFactory;
import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    TextView senha, nome;
    Button entrar;
    RegistrosVendedor rv;
    Login login;


    RelativeLayout rellay1;

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

        rellay1 =(RelativeLayout) findViewById(R.id.rellay1);
        handler.postDelayed(runnable,2000); // is the timeout for the splash

        senha = findViewById(R.id.loginTvSenha);
        nome = findViewById(R.id.loginTvUser);
        entrar = findViewById(R.id.loginEntrarBtn);
        rv = RegistrosVendedor.getRegistrosVendedor();
        login = new Login();

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nomeVendedor = String.valueOf(nome.getText());
                String senhaVendedor =  String.valueOf(senha.getText());


                //Verificar retorna a posiçao do venddedor na Lista dentro do registros vendedor
                int index = login.verificar(nomeVendedor, senhaVendedor);


                //Se senha e nome errados retorna -1
                if (index != -1){

                    Intent intent = new Intent(v.getContext(), TelaPrincipal.class);
                    intent.putExtra("index", index);
                    startActivity(intent);

                }else{


                }

            }


        });

    }


}
