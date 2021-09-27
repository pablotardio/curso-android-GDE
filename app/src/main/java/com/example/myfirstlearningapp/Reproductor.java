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
    ImageButton btnRepetir;

    ImageView ivPortada;
    //a vector that willl willl contain the three songs
    MediaPlayer vectorMP[]=new MediaPlayer[3]; //Vector Media Player
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
        btnRepetir=(ImageButton)findViewById(R.id.imageButtonRepLoop);
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
    public void handleStopButton(View view){
        if(vectorMP[posicion]!=null){
            //Stop the music player, which makes it null
            vectorMP[posicion].stop();
            // Because its null each song has to be reinserted
            vectorMP[0]= MediaPlayer.create(this,R.raw.reproductor_race);
            vectorMP[1]=MediaPlayer.create(this,R.raw.reproductor_sound);
            vectorMP[2]=MediaPlayer.create(this,R.raw.reproductor_tea);
            //Make the button of pause with reproduce to reset it
            btnPlayPause.setImageResource(R.drawable.reproductor_reproducir);
            //Make the image of the first song
            ivPortada.setImageResource(R.drawable.reproductor_portada1);
        }
    }

    /**
     * Para repetir una cancion
     */
    public void handleLoopButton(View view){
        if (repetir==1){
            //Caso en el que esta desactivado el repetir
            btnRepetir.setImageResource(R.drawable.reproductor_no_repetir);
            Toast.makeText(this, "No repetir", Toast.LENGTH_SHORT).show();
            vectorMP[posicion].setLooping(false);
            repetir=2;

        }else{
            if(repetir==2){
                btnRepetir.setImageResource(R.drawable.reproductor_repetir);
                Toast.makeText(this, "Repetir", Toast.LENGTH_SHORT).show();
                vectorMP[posicion].setLooping(true);
                repetir=1;
            }
        }
    }
    //Metodo para saltar al siguiente
    public void handleNextButton(View view){
        if(posicion<vectorMP.length-1){
            if(vectorMP[posicion].isPlaying()){
                vectorMP[posicion].stop();
                vectorMP[0]= MediaPlayer.create(this,R.raw.reproductor_race);
                vectorMP[1]=MediaPlayer.create(this,R.raw.reproductor_sound);
                vectorMP[2]=MediaPlayer.create(this,R.raw.reproductor_tea);
                posicion++;
                this.setCurrentPortada();
                vectorMP[posicion].start();
            }else{
                posicion++;
                this.setCurrentPortada();
            }

        }
        else{
            Toast.makeText(this, "No hay mas canciones", Toast.LENGTH_SHORT).show();
        }
    }

    private void setCurrentPortada() {
        switch (this.posicion) {
            case 0: {
                ivPortada.setImageResource(R.drawable.reproductor_portada1);
                break;
            }
            case 1: {
                ivPortada.setImageResource(R.drawable.reproductor_portada2);
                break;
            }
            case 2: {
                ivPortada.setImageResource(R.drawable.reproductor_portada3);
                break;
            }
        }
    }

    //Metodo para volver a la cancion anterior
    public void handleBackButton(View view){
        if(posicion>1){
            if(vectorMP[posicion].isPlaying()){
                vectorMP[posicion].stop();
                vectorMP[0]= MediaPlayer.create(this,R.raw.reproductor_race);
                vectorMP[1]=MediaPlayer.create(this,R.raw.reproductor_sound);
                vectorMP[2]=MediaPlayer.create(this,R.raw.reproductor_tea);
                posicion--;
                setCurrentPortada();
                vectorMP[posicion].start();
            }
            else{
                posicion--;
                setCurrentPortada();
            }

        }
        else{
            Toast.makeText(this, "No hay mas canciones", Toast.LENGTH_SHORT).show();
        }
    }}