package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PantallaConDatoExterno extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_con_dato_externo);
        String dato=getIntent().getStringExtra("dato");
        tv1=(TextView)findViewById(R.id.textViewDatoExterno);
        tv1.setText("Bienvenido "+dato);
    }
}