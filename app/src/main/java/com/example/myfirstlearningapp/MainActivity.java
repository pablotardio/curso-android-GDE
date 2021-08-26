package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int mat=8;
        int rel=10;
        float promedio =mat+rel/2;
        if(promedio<6){
            Toast.makeText(this,"Aprobado",Toast.LENGTH_SHORT).show();
        }
    }


}