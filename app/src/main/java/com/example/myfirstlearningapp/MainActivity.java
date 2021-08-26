package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1 ;// Edit text number 1
    EditText et2 ;// Edit text number 2
    TextView tv1 ;// Text View number 1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText) findViewById(R.id.editTextNumber_1);
        et2= (EditText) findViewById(R.id.editTextNumber_2);
        tv1= (TextView) findViewById(R.id.textView_1);
    }

    /**
     * This is a void because it will be called by a button on view
     * (I think that the "view" in the parameter is how it comunicattes with the view
     * update Note: if View parameter is not given, it will not appear in the activity xml design edittor button
     */
    public void sumar (View view){
        String valor1= et1.getText().toString();
        String valor2=et2.getText().toString();
        Integer suma=Integer.parseInt(valor1)+Integer.parseInt(valor2);
        tv1.setText(suma.toString());
    }

}