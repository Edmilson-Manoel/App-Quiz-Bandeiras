package com.example.atividadequiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TelaBulgaria extends AppCompatActivity {

    private RadioButton rbtnBulgaria;
    private RadioGroup rgpBulgaria;
    private Button btnResponder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_bulgaria);

        rgpBulgaria = findViewById(R.id.rgpBulgaria);
        rbtnBulgaria = findViewById(R.id.rbtnBulgaria);
        btnResponder = findViewById(R.id.btnResponder);
    }

    public void confirmar(View view) {
        int marcar = rgpBulgaria.getCheckedRadioButtonId();
        int acerto = getIntent().getIntExtra("acerto", 0);

        if (marcar == rbtnBulgaria.getId()) {
            acerto++;
        }
        Intent itGuatemala = new Intent(getApplicationContext(), TelaGuatemala.class);
        itGuatemala.putExtra("acerto", acerto);
        itGuatemala.putExtra("NomeUsuario", getIntent().getStringExtra("NomeUsuario"));
        startActivity(itGuatemala);
        finish();

    }

    public void clicou (View view){
        btnResponder.setEnabled(true);
    }
}