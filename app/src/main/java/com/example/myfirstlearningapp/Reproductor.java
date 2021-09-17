package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Reproductor extends AppCompatActivity {
    ImageButton btnPlayPause;
    ImageView ivPortada;
    //a vector that willl willl contain the three songs
    MediaPlayer vectorMP[]=new MediaPlayer[3];
    int repetir=2,posicion =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);
        assignViewToVariable();
        createMediaPlayers();

    }

    private void createMediaPlayers() {
        vectorMP[0]= MediaPlayer.create(this,R.raw.reproductor_race);
        vectorMP[1]=MediaPlayer.create(this,R.raw.reproductor_sound);
        vectorMP[2]=MediaPlayer.create(this,R.raw.reproductor_tea);
    }

    private void assignViewToVariable() {
        btnPlayPause=(ImageButton)findViewById(R.id.imageButtonRepPlay);
        ivPortada=(ImageView)findViewById(R.id.imageViewRepPortada);
    }
    public void handlePlayPauseButton(View view){
        if(vectorMP[posicion].isPlaying()){
            vectorMP[posicion].pause();
            btnPlayPause.setImageResource(R.drawable.reproductor_reproducir);
            Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
        }else{
            vectorMP[posicion].start();
            btnPlayPause.setImageResource(R.drawable.reproductor_pausa);
            Toast.makeText(this, "Reproduciendo", Toast.LENGTH_SHORT).show();
        }
    }
}