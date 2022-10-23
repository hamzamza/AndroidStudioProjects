package com.localapps.a20calbackinterfaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements SendNameInterface{
    private TextView text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        firstFragment fragmen = new firstFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", "hamza");
        fragmen.setArguments(bundle);
        transaction.replace(R.id.frame, fragmen);
        transaction.commit();
        text = findViewById(R.id.textoutput);
    }

    @Override
    public void sendNameresult(Bundle bundle) {
        if(bundle != null) {
            String msg = bundle.getString("text");
            if(msg != null)
            text.setText(msg);

        }
    }
}