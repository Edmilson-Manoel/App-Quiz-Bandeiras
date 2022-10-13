package com.example.atividadequiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TelaBrasil extends AppCompatActivity {

private Button btnResponder;
private RadioButton rbtnBrasil;
private RadioGroup rgpBrasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_brasil);

        rgpBrasil = findViewById(R.id.rgpBrasil);
        rbtnBrasil = findViewById(R.id.rbtnBrasil);
        btnResponder = findViewById(R.id.btnResponder);
    }

    public void confirmar(View view){
        int marcar = rgpBrasil.getCheckedRadioButtonId();
        int acerto = 0;

        if(marcar == rbtnBrasil.getId()) {
            acerto++;
        }

        Intent itEUA = new Intent(getApplicationContext(),TelaEUA.class);
        itEUA.putExtra("acerto", acerto);
        itEUA.putExtra("NomeUsuario", getIntent().getStringExtra("NomeUsuario"));
        startActivity(itEUA);
        finish();
    }

    public void clicou(View view){
        btnResponder.setEnabled(true);
    }

}