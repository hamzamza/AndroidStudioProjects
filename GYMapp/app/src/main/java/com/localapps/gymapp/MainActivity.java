package com.localapps.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnPlans  , btnAllAcitivies , btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
       // TODO: create one click methodes
        // TODO : create object called traning  and put all the nesserary data you need
        // TODO : create layout for the adapter to handle all the data comming from the array of traingi
        // TODO : create the fragment showen after clicking into anu training to add to do plan
        // TODO : set the recycler view inside the plans activity  ;
    }
    private void initViews(){
        btnPlans = findViewById(R.id.btnplans);
        btnAllAcitivies = findViewById(R.id.btnallactivities);
        btnAbout = findViewById(R.id.btnabout);

    }
}