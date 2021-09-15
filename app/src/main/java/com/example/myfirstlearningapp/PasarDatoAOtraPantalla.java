package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PasarDatoAOtraPantalla extends AppCompatActivity {
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar_dato_a_otra_pantalla);
        et1=(EditText) findViewById(R.id.editTextParaEnviar);

    }

    public void enviarDatos(View view){
        Intent intent = new Intent(this, PantallaConDatoExterno.class);
        intent.putExtra("dato",et1.getText().toString());
        startActivity(intent);
    }
}