package com.example.atividadequiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TelaGuatemala extends AppCompatActivity {

    private RadioButton rbtnGuatemala;
    private RadioGroup rgpGuatemala;
    private Button btnResponder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_guatemala);

        rgpGuatemala = findViewById(R.id.rgpGuatemala);
        rbtnGuatemala = findViewById(R.id.rbtnGuatemala);
        btnResponder = findViewById(R.id.btnResponder);

    }

    public void confirmar(View view) {
        int marcar = rgpGuatemala.getCheckedRadioButtonId();
        int acerto = getIntent().getIntExtra("acerto", 0);

        if (marcar == rbtnGuatemala.getId()) {
            acerto++;
        }
        Intent itTelaScore = new Intent(getApplicationContext(), TelaScore.class);
        itTelaScore.putExtra("acerto", acerto);
        itTelaScore.putExtra("NomeUsuario", getIntent().getStringExtra("NomeUsuario"));
        startActivity(itTelaScore);
        finish();

    }

    public void clicou (View view){
        btnResponder.setEnabled(true);
    }
}