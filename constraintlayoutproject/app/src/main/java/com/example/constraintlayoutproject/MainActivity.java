package com.example.constraintlayoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import android.widget.Spinner;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity  {
private Spinner list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            list = findViewById(R.id.spinner);

             ArrayList<String> cities = new ArrayList<>();
             cities.add("agadir");
             cities.add("taroudant");
             ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,cities );


    }
}