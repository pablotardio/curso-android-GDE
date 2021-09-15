package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class form_validation extends AppCompatActivity {
    EditText etn,etp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_validation);
        assignViewToAttributes();
    }
    public void assignViewToAttributes(){
        this.etn=(EditText) findViewById(R.id.editTextTextPersonName_formValidation);
        this.etp=(EditText) findViewById(R.id.editTextTextPassword_editTextTextPersonName_formValidation);
    }
    public void Registrar (View view){
        String nombres =etn.getText().toString();
        String password =etp.getText().toString();

        if(nombres.length()==0){
            Toast.makeText(this, "debes ingresar un nombre", Toast.LENGTH_SHORT).show();
        }
        if(password.length()==0){
            Toast.makeText(this, "debes ingresar un password", Toast.LENGTH_SHORT).show();
        }
        if(password.length()!=0 && nombres.length()!=0){
            Toast.makeText(this, "Registro en proceso", Toast.LENGTH_SHORT).show();
        }
    }
}