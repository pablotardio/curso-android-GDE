package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ImageButtonTesting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button_testing);
    }
    public void buttonGeekpediaClickHandler(View view){
        Toast.makeText(this, "Esto es un boton imagen de geekpedia", Toast.LENGTH_SHORT).show();
    }

    public void buttonManoClickHandler(View view){
        Toast.makeText(this, "Esto es un boton imagen de Manooo", Toast.LENGTH_SHORT).show();
    }
}