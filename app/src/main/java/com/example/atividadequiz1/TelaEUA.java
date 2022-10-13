package com.example.atividadequiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TelaEUA extends AppCompatActivity {

    private RadioButton rbtnEUA;
    private RadioGroup rgpEUA;
    private Button btnResponder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_eua);

        rgpEUA = findViewById(R.id.rgpEUA);
        rbtnEUA = findViewById(R.id.rbtnEUA);
        btnResponder = findViewById(R.id.btnResponder);
    }

    public void confirmar(View view){
        int marcar = rgpEUA.getCheckedRadioButtonId();
        int acerto = getIntent().getIntExtra("acerto", 0);

        if(marcar == rbtnEUA.getId()) {
            acerto++;
        }

        Intent itCuba = new Intent(getApplicationContext(),TelaCuba.class);
        itCuba.putExtra("acerto", acerto);
        itCuba.putExtra("NomeUsuario", getIntent().getStringExtra("NomeUsuario"));
        startActivity(itCuba);
        finish();
    }

    public void clicou(View view){
        btnResponder.setEnabled(true);
    }

}