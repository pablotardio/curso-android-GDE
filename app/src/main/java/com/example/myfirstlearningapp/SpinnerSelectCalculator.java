package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerSelectCalculator extends AppCompatActivity {
    EditText et1 ;
    EditText et2 ;
    Spinner spinner;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_select_calculator);
        this.assignViewToVariables();
    }
    private void assignViewToVariables(){
        this.et1=(EditText) findViewById(R.id.editTextSpinnerCalc1);
        this.et2=(EditText) findViewById(R.id.editTextSpinnerCalc2);
        this.spinner=(Spinner) findViewById(R.id.spinnerCalc);
        this.tv=(TextView)findViewById(R.id.textViewSpinnerCalc);
        String [] spinnerItems={"sumar","restar","multiplicar","dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,spinnerItems);
        spinner.setAdapter(adapter);
    }
    public void calcular(View view){
        String selection=spinner.getSelectedItem().toString();
        Integer number1=Integer.parseInt(et1.getText().toString());
        Integer number2=Integer.parseInt(et2.getText().toString());
        Integer resultado=0;
        System.out.println(selection);
        switch(selection){
            case "sumar":
                resultado=number1+number2;
            break;
            case "restar":
                resultado=number1-number2;
                break;
            case "multiplicar":
                resultado=number1*number2;
                break;
            case "dividir":
                    if(number2!=0){
                        resultado=number1/number2;
                    }else {
                        Toast.makeText(this,"No se puede dividir entre 0",Toast.LENGTH_LONG).show();
                    }

                break;

        }
        tv.setText(resultado.toString());
    }
}