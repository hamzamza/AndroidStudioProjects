package com.example.fontsactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
private TextView text ;
private Button buton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        buton = findViewById(R.id.button);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.falling);
        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.roboto9000);

buton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(text.getTypeface() == typeface) {
            text.setTypeface(typeface1);}
        else{
                text.setTypeface(typeface);
            }

    }
});
    }

}