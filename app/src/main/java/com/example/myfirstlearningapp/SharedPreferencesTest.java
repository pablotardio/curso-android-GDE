package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPreferencesTest extends AppCompatActivity {
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_test);
        //Al abrir debo cargar el Dato del shared preferences
        SharedPreferences sharedPreferences= getSharedPreferences("datos", Context.MODE_PRIVATE);
        assignViewToVariable();
        //obtengo un atributo del sharedPreference anterior , debe tener string vacio de segundo parametro como valor por defecto
        String storedEmail=sharedPreferences.getString("email","");
        et1.setText(storedEmail);
    }
    public void assignViewToVariable(){
        et1=(EditText)findViewById(R.id.editText01SharedPref);
    }

    /**
     * Function to save the data of the edittext01 in the shared preferences when pressed
     */
    public void handleButtonSave(View view){
        //obtengo el shared preferences a editar
        SharedPreferences sharedPreferences =getSharedPreferences("datos",Context.MODE_PRIVATE);
        //Creo un Objeto para un sharedPrefs editable
        SharedPreferences.Editor objEditor=sharedPreferences.edit();
        //edito el string deseado
        objEditor.putString("email",et1.getText().toString());
        //hago commit de mi editado
        objEditor.commit();
        Toast.makeText(this,"guardado",Toast.LENGTH_SHORT).show();
    }
}