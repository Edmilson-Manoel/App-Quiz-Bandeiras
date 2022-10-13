package com.example.atividadequiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaScore extends AppCompatActivity {

    private TextView edtNomeUser, edtAcertos;
    private Button btnResNov, btnTelaInicial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_score);

        edtNomeUser = findViewById(R.id.edtNomeUser);
        edtAcertos = findViewById(R.id.edtAcertos);
        btnResNov = findViewById(R.id.btnResNov);
        btnTelaInicial = findViewById(R.id.btnTelaInicial);

        String nome = getIntent().getStringExtra("NomeUsuario");
        int acerto = getIntent().getIntExtra("acerto", 0);
        edtNomeUser.setText(nome);
        edtAcertos.setText(String.valueOf(acerto));
    }

    public void responderNov(View view){
        Intent telaBrasil = new Intent(getApplicationContext(),TelaBrasil.class);
        telaBrasil.putExtra("NomeUsuario", getIntent().getStringExtra("NomeUsuario"));
        startActivity(telaBrasil);
        finish();
    }

    public void telaInicial(View view){
        Intent telaInicial = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(telaInicial);
        finish();
    }

}