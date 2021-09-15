package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AllActivitiesMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_activities_menu);
    }
    public void navigateToMain(View view){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void navigateToRadioCalculator(View view){
        Intent intent= new Intent(this,RadioCalculator.class);
        startActivity(intent);
    }
    public void navigateToScreenCalculator(View view){
        Intent intent= new Intent(this,screen_calculator.class);
        startActivity(intent);
    }public void navigateToSpinnerSelect(View view){
        Intent intent= new Intent(this,SpinnerSelectCalculator.class);
        startActivity(intent);
    }public void navigateToListViewNames(View view){
        Intent intent= new Intent(this,ListViewNames.class);
        startActivity(intent);
    }
    public void navigateToChecklistCalculator(View view){
        Intent intent= new Intent(this,CheckListCalculator.class);
        startActivity(intent);
    }
    public void navigateToImageButton(View view){
        Intent intent= new Intent(this,ImageButtonTesting.class);
        startActivity(intent);
    }
    public void navigateToFormValidation(View view){
        Intent intent= new Intent(this,form_validation.class);
        startActivity(intent);
    }

    public void navigateToPasarDatoAOtraPantalla(View view){
        Intent intent= new Intent(this,PasarDatoAOtraPantalla.class);
        startActivity(intent);
    }

    public void navigateToWebView(View view){
        Intent intent= new Intent(this,WebViewDataWrite.class);
        startActivity(intent);
    }
    public void navigateToSharedPrefs(View view){
        Intent intent= new Intent(this,SharedPreferencesTest.class);
        startActivity(intent);
    }
    public void navigateToContactSharedPrefs(View view){
        Intent intent= new Intent(this,ContactsSharedPrefs.class);
        startActivity(intent);
    }
    public void navigateToFichero(View view){
        Intent intent= new Intent(this,Ficheros_test.class);
        startActivity(intent);
    }
    public void navigateToDBTest(View view){
        Intent intent= new Intent(this,DatabaseTest.class);
        startActivity(intent);
    }
}