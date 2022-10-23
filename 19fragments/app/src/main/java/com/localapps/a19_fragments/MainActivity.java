package com.localapps.a19_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        FirstFragment frag = new FirstFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", "hamza");
        frag.setArguments(bundle);
        transaction.replace(R.id.framelayout, new FirstFragment());
        transaction.commit();
    }
}