package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class RecorderTest extends AppCompatActivity {
    ImageButton btnPlay;
    ImageButton btnRecord;
    private MediaRecorder grabacion;
    private String archivoSalida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recorder_test);
        this.getRecorderPermissions();
        assignViewToVariables();
    }

    private void getRecorderPermissions() {
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(RecorderTest.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}, 1000);
        }
    }

    private void assignViewToVariables() {
        btnPlay=(ImageButton)findViewById(R.id.imageButtonRecPlay);
        btnRecord =(ImageButton)findViewById(R.id.imageButtonRecStop);
    }

    public void handleClickRecord(View view){
        if(grabacion==null){
            //obtengo el path
            this.archivoSalida= getCacheDir().getAbsolutePath()+"/grabacionTest.mp3";
            this.grabacion=new MediaRecorder();
            //De donde estamos grabando
            this.grabacion.setAudioSource(MediaRecorder.AudioSource.MIC);
            this.grabacion.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT);
            this.grabacion.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
            this.grabacion.setOutputFile(archivoSalida);
            //comenzamos la grabacion
            try {
                grabacion.prepare();
                grabacion.start();

            }catch (Exception e){

            }
            btnRecord.setImageResource(R.drawable.rec_rec);
            Toast.makeText(this, "Grabando...", Toast.LENGTH_SHORT).show();
        }else if(grabacion!=null){
            grabacion.stop();
            grabacion.release();
            grabacion=null;
            btnRecord.setImageResource(R.drawable.rec_stop_rec);
            Toast.makeText(this, "Grabacion detenida", Toast.LENGTH_SHORT).show();
        }

    }
    //para reproducir
    public void handleClickPlay(View view){
        MediaPlayer mediaPlayer= new MediaPlayer();
        try {
            mediaPlayer.setDataSource(this.archivoSalida);
            mediaPlayer.prepare();
            mediaPlayer.start();
            Toast.makeText(this, "Reproduciendo", Toast.LENGTH_SHORT).show();
        }catch (Exception e){

        }

    }

}