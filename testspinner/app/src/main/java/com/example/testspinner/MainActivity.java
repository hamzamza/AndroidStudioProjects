package com.example.testspinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private Spinner spin ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin =  findViewById(R.id.spinner);
         ArrayList<String> cities = new ArrayList<>();
        cities.add("agadir");
        cities.add("taroudant");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,cities );
spin.setAdapter(adapter);
spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView adapterView, View view, int i, long l) {
        Toast.makeText(MainActivity.this, " "+ i + " selected " + cities.get(i), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        System.out.println(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.settingmenu:
                Toast.makeText(this, "settings clicked", Toast.LENGTH_SHORT).show();
                return true ;
            case R.id.alarmmenu:
                Toast.makeText(this, "alarm clicked", Toast.LENGTH_SHORT).show();
                    return true;

            default:
                return super.onOptionsItemSelected(item);

        }


    }
}