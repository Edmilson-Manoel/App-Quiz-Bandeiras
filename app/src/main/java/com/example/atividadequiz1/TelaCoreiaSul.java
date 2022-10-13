package com.example.atividadequiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TelaCoreiaSul extends AppCompatActivity {

    private RadioButton rbtnCoreiaSul;
    private RadioGroup rgpCoreiaSul;
    private Button btnResponder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_coreia_sul);

        rgpCoreiaSul = findViewById(R.id.rgpCoreiaSul);
        rbtnCoreiaSul = findViewById(R.id.rbtnCoreiaSul);
        btnResponder = findViewById(R.id.btnResponder);
    }

    public void confirmar(View view) {
        int marcar = rgpCoreiaSul.getCheckedRadioButtonId();
        int acerto = getIntent().getIntExtra("acerto", 0);

        if (marcar == rbtnCoreiaSul.getId()) {
            acerto++;
        }
        Intent itCanada = new Intent(getApplicationContext(), TelaCanada.class);
        itCanada.putExtra("acerto", acerto);
        itCanada.putExtra("NomeUsuario", getIntent().getStringExtra("NomeUsuario"));
        startActivity(itCanada);
        finish();

    }

    public void clicou (View view){
        btnResponder.setEnabled(true);
    }

}