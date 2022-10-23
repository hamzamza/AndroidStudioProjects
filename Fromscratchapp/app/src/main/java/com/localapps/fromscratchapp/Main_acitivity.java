package com.localapps.fromscratchapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.localapps.fromscratchapp.R;
public class Main_acitivity extends AppCompatActivity {
     private String TAG = "message" ;
   private String salam = "salam";
    private Button btn ;
    private TextView textview  ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        Log.d(TAG, "onCreate : started ");
        textview = findViewById(R.id.textView);
        btn = findViewById(R.id.btn);
        if(savedInstanceState != null){
            String msg = savedInstanceState.getString("text");
            if(msg != null ){
                textview.setText(salam);
            }
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textview.setText(salam);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("text" , textview.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: started ");
        super.onStart();
    }
/*

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: started ");

        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: started ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: started");
        super.onStop();

    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: started ");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: started");
        super.onDestroy();
    }
 */

}
