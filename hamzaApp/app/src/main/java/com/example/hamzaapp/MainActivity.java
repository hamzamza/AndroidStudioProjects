package com.example.hamzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

// dbestech

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onclickmethod(View view){

        TextView nametext = findViewById(R.id.firstnaemtext);
        TextView lasttext = findViewById(R.id.lastnametext);
        TextView emailtext = findViewById(R.id.emailtext);
        EditText first_name = findViewById(R.id.first_name);
        EditText last_name = findViewById(R.id.last_name);
        EditText email = findViewById(R.id.email);
        nametext.setText(first_name.getText().toString());
        lasttext.setText(last_name.getText().toString());
        emailtext.setText(email.getText().toString());

    }
}