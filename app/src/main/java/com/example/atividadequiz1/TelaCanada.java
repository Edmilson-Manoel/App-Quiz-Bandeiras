package com.example.atividadequiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TelaCanada extends AppCompatActivity {

    private RadioButton rbtnCanada;
    private RadioGroup rgpCanada;
    private Button btnResponder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_canada);

        rgpCanada = findViewById(R.id.rgpCanada);
        rbtnCanada = findViewById(R.id.rbtnCanada);
        btnResponder = findViewById(R.id.btnResponder);
    }

    public void confirmar(View view) {
        int marcar = rgpCanada.getCheckedRadioButtonId();
        int acerto = getIntent().getIntExtra("acerto", 0);

        if (marcar == rbtnCanada.getId()) {
            acerto++;
        }
        Intent itHungria = new Intent(getApplicationContext(), TelaHungria.class);
        itHungria.putExtra("acerto", acerto);
        itHungria.putExtra("NomeUsuario", getIntent().getStringExtra("NomeUsuario"));
        startActivity(itHungria);
        finish();

    }

    public void clicou (View view){
        btnResponder.setEnabled(true);
    }


}