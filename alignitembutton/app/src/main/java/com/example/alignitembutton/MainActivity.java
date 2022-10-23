package com.example.alignitembutton;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fb;
    RelativeLayout parent;
    MaterialCardView cardView ;
    Snackbar snackbar;
    private void  showSnackbar() {
        snackbar.make(parent ,"this is a snackbar" , Snackbar.LENGTH_INDEFINITE ).setAction("retry", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "errror again", Toast.LENGTH_SHORT).show();
            }
        }).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fb = findViewById(R.id.fab);
        cardView = findViewById(R.id.cardvue);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parent = findViewById(R.id.parent);

               showSnackbar();

            }
        });
    }
}