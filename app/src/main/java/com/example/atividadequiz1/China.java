package com.example.atividadequiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class China extends AppCompatActivity {

    private RadioButton rbtnChina;
    private RadioGroup rgpChina;
    private Button btnResponder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);

        rgpChina = findViewById(R.id.rgpChina);
        rbtnChina = findViewById(R.id.rbtnChina);
        btnResponder = findViewById(R.id.btnResponder);

    }

    public void confirmar(View view) {
        int marcar = rgpChina.getCheckedRadioButtonId();
        int acerto = getIntent().getIntExtra("acerto", 0);

        if (marcar == rbtnChina.getId()) {
            acerto++;
        }
        Intent itCoreiaSul = new Intent(getApplicationContext(), TelaCoreiaSul.class);
        itCoreiaSul.putExtra("acerto", acerto);
        itCoreiaSul.putExtra("NomeUsuario", getIntent().getStringExtra("NomeUsuario"));
        startActivity(itCoreiaSul);
        finish();

    }

    public void clicou (View view){
        btnResponder.setEnabled(true);
    }



}