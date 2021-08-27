package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class CheckListCalculator extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView tv;
    CheckBox cbSuma;
    CheckBox cbResta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list_calculator);
        this.assignViewToVariables();
    }
    private void assignViewToVariables(){
        et1=(EditText) findViewById(R.id.editTextCheckLCalculator1);
        et2=(EditText) findViewById(R.id.editTextCheckLCalculator2);
        tv= (TextView)findViewById(R.id.textViewCheckLCalculator);
        cbSuma= (CheckBox)findViewById(R.id.checkBoxCheckLCalculatorSum);
        cbResta= (CheckBox)findViewById(R.id.checkBoxCheckLCalculatorRes);
    }
    public void calcular(View view){
        String strResult="";
        Integer number1=Integer.parseInt(et1.getText().toString());
        Integer number2=Integer.parseInt(et2.getText().toString());
        if(cbSuma.isChecked()){
            Integer res=number1+number2;
            strResult+="La Suma es :"+(res.toString());
        }

        if(cbResta.isChecked()){
            Integer res=number1-number2;
            strResult+=" / La Resta es: "+(res.toString());
        }
            tv.setText(strResult);
    }
}