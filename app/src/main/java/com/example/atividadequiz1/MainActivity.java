package com.example.atividadequiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtNome;
    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        btnIniciar = findViewById(R.id.btnIniciar);

        edtNome.setOnKeyListener(new View.OnKeyListener()
        {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent)
            {
                if(edtNome.getText().length() > 1)
                {
                    btnIniciar.setEnabled(true);
                    return  true;
                }
                else if(edtNome.getText().length() == 0)
                {
                    btnIniciar.setEnabled(false);
                }
                return false;
            }
        });
    }





    public void iniciar(View view){
    Intent telaBrasil = new Intent(getApplicationContext(), TelaBrasil.class);
    telaBrasil.putExtra("NomeUsuario", edtNome.getText().toString());
    startActivity(telaBrasil);
    }

    public void sair(View view){
        finish();
    }


}