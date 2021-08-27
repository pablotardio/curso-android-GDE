package com.example.myfirstlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ListViewNames extends AppCompatActivity {
TextView tv;
ListView lv;
String[] names={"Pepe","Juan","Daniel","Camila"};
String[] ages ={"13","34","22","24"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_names);
        this.assignViewToAttributes();
    }
    private void assignViewToAttributes(){
           tv=(TextView) findViewById(R.id.textViewNames);
           lv=(ListView) findViewById(R.id.listViewNames);
        ArrayAdapter<String> listAdapter= new ArrayAdapter<String>(this,R.layout.list_item_custompablo,names);
        lv.setAdapter(listAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv.setText("La edad de "+lv.getItemAtPosition(position).toString()+" es: "+ages[position]);

            }
        });

    }
}