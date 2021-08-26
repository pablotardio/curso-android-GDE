package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioCalculator extends AppCompatActivity {
    EditText et1;
    EditText et2;
    RadioButton rbSuma;
    RadioButton rbResta;
    TextView tv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_calculator);
        this.asignViewToVariables();
    }
    private  void asignViewToVariables(){
        this.et1 = (EditText) findViewById(R.id.editTextCalculator1);
        this.et2 = (EditText) findViewById(R.id.editTextCalculator2);
        this.rbSuma = (RadioButton) findViewById(R.id.radioButtonCalculatorSuma);
        this.rbResta = (RadioButton) findViewById(R.id.radioButtonCalculatorResta);
        this.tv = (TextView) findViewById(R.id.textViewRadioCalculator);
    }
    public void calculate(View view){
        Integer numb1=Integer.parseInt(et1.getText().toString());
        Integer numb2=Integer.parseInt(et2.getText().toString());
        Integer result;
        if(this.rbSuma.isChecked()){
            result=numb1+numb2;

        }else{
            result=numb1-numb2;
        }
        tv.setText(result.toString());
    }
}