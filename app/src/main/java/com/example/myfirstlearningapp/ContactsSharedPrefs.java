package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ContactsSharedPrefs extends AppCompatActivity {
    EditText etName,etMultiline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_shared_prefs);
        assignViewToVariables();
    }
    public void assignViewToVariables(){
        etName=(EditText)findViewById(R.id.editTextContact01);
        etMultiline=(EditText)findViewById(R.id.editTextMultilineContact01);
    }
    public void handleButtonSave(View view){
        SharedPreferences preferences=getSharedPreferences("contacts", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        String contactName = etName.getText().toString();
        String contactData= etMultiline.getText().toString();
        editor.putString(contactName,contactData);
        editor.commit();
        Toast.makeText(this,"Contacto guardado",Toast.LENGTH_LONG).show();
    }

    public void handleButtonSearch(View view){
        SharedPreferences preferences = getSharedPreferences("contacts",Context.MODE_PRIVATE);
        String contactName = etName.getText().toString();

        String contactData=preferences.getString(contactName,"");
        if(contactData.length()==0){
            Toast.makeText(this, "No se encontro el contacto", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Contacto Encontrado", Toast.LENGTH_SHORT).show();
            etMultiline.setText(contactData);
        }


    }
}



