package com.example.atividadequiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TelaItalia extends AppCompatActivity {

    private RadioButton rbtnItalia;
    private RadioGroup rgpItalia;
    private Button btnResponder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_italia);

        rgpItalia = findViewById(R.id.rgpItalia);
        rbtnItalia = findViewById(R.id.rbtnItalia);
        btnResponder = findViewById(R.id.btnResponder);

    }

    public void confirmar(View view) {
        int marcar = rgpItalia.getCheckedRadioButtonId();
        int acerto = getIntent().getIntExtra("acerto", 0);

        if (marcar == rbtnItalia.getId()) {
            acerto++;
        }
        Intent itBulgaria = new Intent(getApplicationContext(), TelaBulgaria.class);
        itBulgaria.putExtra("acerto", acerto);
        itBulgaria.putExtra("NomeUsuario", getIntent().getStringExtra("NomeUsuario"));
        startActivity(itBulgaria);
        finish();

    }

    public void clicou (View view){
        btnResponder.setEnabled(true);
    }

}