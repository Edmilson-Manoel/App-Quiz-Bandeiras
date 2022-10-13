package com.example.atividadequiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TelaCuba extends AppCompatActivity {

    private RadioButton rbtnCuba;
    private RadioGroup rgpCuba;
    private Button btnResponder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cuba);

        rgpCuba = findViewById(R.id.rgpCuba);
        rbtnCuba = findViewById(R.id.rbtnCuba);
        btnResponder = findViewById(R.id.btnResponder);
    }

    public void confirmar(View view) {
        int marcar = rgpCuba.getCheckedRadioButtonId();
        int acerto = getIntent().getIntExtra("acerto", 0);

        if (marcar == rbtnCuba.getId()) {
            acerto++;
        }
        Intent itChina = new Intent(getApplicationContext(), China.class);
        itChina.putExtra("acerto", acerto);
        itChina.putExtra("NomeUsuario", getIntent().getStringExtra("NomeUsuario"));
        startActivity(itChina);
        finish();

    }

    public void clicou (View view){
        btnResponder.setEnabled(true);
    }
}