package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class WebViewOpeningPage extends AppCompatActivity {
    WebView wb01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_opening_page);
        assignViewToVar();
        String url=getIntent().getStringExtra("url");
        wb01.loadUrl("https://"+url);
    }
    public void assignViewToVar(){
        wb01=(WebView) findViewById(R.id.webViewWebView01);
    }
    public  void handleButtonAtras(View view){
        finish();
    }
}