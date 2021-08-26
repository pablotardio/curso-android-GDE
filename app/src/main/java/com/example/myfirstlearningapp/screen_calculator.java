package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class screen_calculator extends AppCompatActivity {
    //Step 1: create the objects that will contain the view objects
    EditText etFis;//Edit text for fisica note
    EditText etQuim;//Edit text for quimica note
    EditText etMat; //Edit text for matematica note
    TextView tvResult; //Text view for the result
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_calculator);
        //Step 2: On build "assign" each interface to their object, I see this procedure similar to a constructor
        //You have to  cast the specific class of view
        etFis = (EditText) findViewById(R.id.editTextNumberFis);
        etQuim = (EditText) findViewById(R.id.editTextNumberQuim);
        etMat = (EditText) findViewById(R.id.editTextNumberMat);
        tvResult = (TextView) findViewById(R.id.textViewNota);
    }

    public void calculateGrade(View view){
        Integer fisInt=Integer.parseInt(etFis.getText().toString());
        Integer quimInt=Integer.parseInt(etQuim.getText().toString());
        Integer matInt=Integer.parseInt(etMat.getText().toString());

        Integer prom = (fisInt+quimInt+matInt)/3;
        if(prom >=51){
            tvResult.setText("Aprobo con : "+prom.toString());
        }else{
            tvResult.setText("Reprobo con : "+prom.toString());
        }

    }
}