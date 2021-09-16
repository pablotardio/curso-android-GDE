package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LayoutFrameLayout extends AppCompatActivity {
    Button btn;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_frame_layout);
        assignViewToVariables();
    }

    private void assignViewToVariables() {
        btn = (Button)findViewById(R.id.buttonFrameLayoutOcultar);
        image = (ImageView) findViewById(R.id.imageViewFrameLayout);
    }

    public void handleButtonOcultar(View view){
        btn.setVisibility(View.INVISIBLE);
        image.setVisibility(View.VISIBLE);

    }

}