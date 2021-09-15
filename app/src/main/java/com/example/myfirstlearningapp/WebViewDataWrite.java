package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WebViewDataWrite extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_data_write);
        assignViewToVariables();
    }
    public void assignViewToVariables(){
        tv1=(TextView) findViewById(R.id.editTextWebView01);
    }
    public void handleButtonClickSendData(View view){
        Intent intent = new Intent(this, WebViewOpeningPage.class);
        intent.putExtra("url",tv1.getText().toString());
        startActivity(intent);
    }
}