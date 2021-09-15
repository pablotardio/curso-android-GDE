package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DatabaseTest extends AppCompatActivity {
    EditText etId,etName,etPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_test);
        assignViewsToVariables();
    }
    public void assignViewsToVariables(){
        etId=(EditText) findViewById(R.id.editTextTextDBId);
        etName=(EditText) findViewById(R.id.editTextTextDBName);
        etPrice=(EditText) findViewById(R.id.editTextTextDBPrice);
    }

    public void handleClickButtonRegistrar(View view){
        registrarInDB();
    }
    public void registrarInDB(){
        //I have to create an admin from the class I manually created
        AdminSQLiteHelper admin = new AdminSQLiteHelper(this,"administracion",null,1);
        //I have to create a "databse writer" with the SQLiteDatabase class
        SQLiteDatabase baseDeDatos =admin.getWritableDatabase();
        // I get the data from the edit texts
        String id=etId.getText().toString();
        String nombre=etName.getText().toString();
        String precio=etPrice.getText().toString();

        //Validation of all the data of form
        if (!id.isEmpty() && !nombre.isEmpty() && !precio.isEmpty()){
            //create a "row Writer" of the Database with the class contentValues
            ContentValues registro =new ContentValues();
            registro.put("id",id);
            registro.put("nombre",nombre);
            registro.put("precio",precio);
            //insert the row inside the database
            baseDeDatos.insert("articulos",null,registro);
            // close the database
            baseDeDatos.close();

            etId.setText("");
            etName.setText("");
            etPrice.setText("");
            Toast.makeText(this, "Guardado en la base de datos", Toast.LENGTH_SHORT).show();
        }
    }

}