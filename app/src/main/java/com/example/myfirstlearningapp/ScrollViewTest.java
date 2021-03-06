package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ScrollViewTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_test);

        //Poner el icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
    public void handlePressFruta(View view){
        /**
         * To have all the buttons in one row
         */
        switch (view.getId()){
            case R.id.imageButtonFruitBanana:
                Toast.makeText(this, "Esto es una Banana", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitCereza:
                Toast.makeText(this, "Esto es una cereza", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitFrambuesa:
                Toast.makeText(this, "Esto es una Frambuesa", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitFresa:
                Toast.makeText(this, "Esto es una Fresa", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitKiwi:
                Toast.makeText(this, "Esto es una Kiwi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitMango:
                Toast.makeText(this, "Esto es una Mango", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitManzana:
                Toast.makeText(this, "Esto es una Manzana", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitMelon:
                Toast.makeText(this, "Esto es una Melon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitNaranja:
                Toast.makeText(this, "Esto es una Naranja", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitPera:
                Toast.makeText(this, "Esto es una Pera", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitPina:
                Toast.makeText(this, "Esto es una Pi??a", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitSandia:
                Toast.makeText(this, "Esto es una Sandia", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitUva:
                Toast.makeText(this, "Esto es una Uva", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonFruitZarzamora:
                Toast.makeText(this, "Esto es una Zarzamora", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}