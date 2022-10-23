 package com.localapps.books_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {
private Button seeAllbtn , currentlyBtn , alreadyBtn , wishBtn, favoritsBtn , aboutBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        seeAllbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this  , AllBooksActivity.class);
                startActivity(intent);
            }
        });
    }


    private void initializeViews(){
        seeAllbtn = findViewById(R.id.seeAllBtn);
        currentlyBtn = findViewById(R.id.currentReadingBtn);
        alreadyBtn = findViewById(R.id.alreadyReadBtn);
        wishBtn = findViewById(R.id.wishListBtn);
        favoritsBtn = findViewById(R.id.favoritsBtn);
        aboutBtn = findViewById(R.id.aboutBtn);
    }
}