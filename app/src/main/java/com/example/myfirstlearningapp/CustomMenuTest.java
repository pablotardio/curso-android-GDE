package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class CustomMenuTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_menu_test);
    }
    //Metodo para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        //tomo mi menu y le envio el menu de parametro
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }
    //Metodo para asignar las funciones correspondientes a las opciones
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();

        if(id==R.id.MenuItem1CustomMenu){
            Toast.makeText(this, "Opcion 1", Toast.LENGTH_SHORT).show();
        }
        switch (id){
            case (R.id.MenuItem1CustomMenu):
                Toast.makeText(this, "Opcion 1", Toast.LENGTH_SHORT).show();
            break;
            case (R.id.MenuItem2CustomMenu):
                Toast.makeText(this, "Opcion 2", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.MenuItem3CustomMenu):
                Toast.makeText(this, "Opcion 3", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.MenuItemCompartirCustomMenu):
                Toast.makeText(this, "Opcion Compartir", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.MenuItemBuscarCustomMenu):
                Toast.makeText(this, "Opcion Buscar", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}