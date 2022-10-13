package com.example.atividadequiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TelaHungria extends AppCompatActivity {

    private RadioButton rbtnHungria;
    private RadioGroup rgpHungria;
    private Button btnResponder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_hungria);

        rgpHungria = findViewById(R.id.rgpHungria);
        rbtnHungria = findViewById(R.id.rbtnHungria);
        btnResponder = findViewById(R.id.btnResponder);
    }

    public void confirmar(View view) {
        int marcar = rgpHungria.getCheckedRadioButtonId();
        int acerto = getIntent().getIntExtra("acerto", 0);

        if (marcar == rbtnHungria.getId()) {
            acerto++;
        }
        Intent itItalia = new Intent(getApplicationContext(), TelaItalia.class);
        itItalia.putExtra("acerto", acerto);
        itItalia.putExtra("NomeUsuario", getIntent().getStringExtra("NomeUsuario"));
        startActivity(itItalia);
        finish();

    }

    public void clicou (View view){
        btnResponder.setEnabled(true);
    }


}