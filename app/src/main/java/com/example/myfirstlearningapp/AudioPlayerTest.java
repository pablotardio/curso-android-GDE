package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AudioPlayerTest extends AppCompatActivity {
    Button playBtn;
    SoundPool sp;
    int sonidoDeReproduccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_player_test);
       // playBtn=(Button)findViewById(R.id.buttonAudioSoundPool);
        //we have to load soundPool Variables
        sp= new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        sonidoDeReproduccion=sp.load(this,R.raw.sound_short,1);

    }
    public void handleClickSoundPool(View view){
        sp.play(sonidoDeReproduccion,1,1,1,0,0);
        
    }
    
    public void handleClickButtonMediaPlayer(View view){
        MediaPlayer mp= MediaPlayer.create(this,R.raw.sound_long);
        mp.start();

    }
}