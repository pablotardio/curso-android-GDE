package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ficheros_test extends AppCompatActivity {
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficheros_test);
        //assign view to variable
        et1 =(EditText) findViewById(R.id.editTextMultiLineFichero);
        //Open the saved data
        openAndLoadFichero();
    }
    public void openAndLoadFichero(){
        String fileName="bitacora.txt";
        //Getting the file list of the app for searching the one that I need
        String archivos []=fileList();
        if(archivoExiste(archivos,fileName)){
            try {
                //Open the file in the memory
                InputStreamReader archivo= new InputStreamReader(openFileInput(fileName));
                //Assign the file to a variable to be readed
                BufferedReader br= new BufferedReader(archivo);
                //read the first line
                String linea =br.readLine();
                String bitacoraCompleta="";
                //We have to read line by line until is empty/null
                while(linea!=null){
                    //add the line to the master string
                    bitacoraCompleta=bitacoraCompleta+linea +"\n";
                    //read next line
                    linea=br.readLine();
                }
                //close the bufferedReader
                br.close();
                //close the file
                archivo.close();
                //update the multiline edit text
                et1.setText(bitacoraCompleta);

            }catch (IOException e){

            }

        }


    }
    public boolean archivoExiste(String archivos [],String nombreArchivo){
        for(int i=0;i<archivos.length;i++){
            if(nombreArchivo.equals(archivos[i])){
                return true;
            }
        }
        return false;
    }
    public void handleClickGuardar(View view){
        try{
            //file to be WRITTEN
            OutputStreamWriter archivo= new OutputStreamWriter(openFileOutput("bitacora.txt", Activity.MODE_PRIVATE));
            //Write on the file
            archivo.write(et1.getText().toString());
            //clean the ...buffer?
            archivo.flush();
            //close the file
            archivo.close();

        }catch (IOException e){

        }
        Toast.makeText(this, "bitacora guardada", Toast.LENGTH_SHORT).show();
    }
}