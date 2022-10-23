package com.localapps.fromscratchapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    String TAG = "message";

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if(null != intent )
        {
            Bundle bundle = intent.getBundleExtra("bundle");
            if(bundle != null){
                Toast.makeText(this, bundle.getString("name"), Toast.LENGTH_SHORT).show();
            }

        }
        setContentView(R.layout.secondlayout);
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: second app resumed ");
        super.onResume();
    }
}
