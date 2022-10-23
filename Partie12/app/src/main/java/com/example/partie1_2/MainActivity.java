package com.example.partie1_2;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener ,CompoundButton.OnCheckedChangeListener,RadioGroup.OnCheckedChangeListener  {
  private CheckBox checkboxjoker , checkBoxbatman , checkBoxsuperman;
  private RadioGroup radiogroupitem ;

    Button testbtn;
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        RadioButton one  = findViewById(i);
        Toast.makeText(this, "you'r "+ one.getText(), Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
      if (b)
          Toast.makeText(this, "yes you have watched "+ compoundButton.getText(), Toast.LENGTH_SHORT).show();
        else
          Toast.makeText(this, "no you didn't watch " + compoundButton.getText(), Toast.LENGTH_SHORT).show();
    }
    @Override

    public void onClick(View view) {
        Toast.makeText(this, "some button clicked type of"+ view.getClass().getName(), Toast.LENGTH_SHORT).show();
        switch (view.getId()){
            case R.id.btn:
                System.out.println("the test button has been clicked");
                break;
            default: break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testbtn = findViewById(R.id.btn);
        System.out.println(testbtn.getId());
        checkboxjoker = findViewById(R.id.jokerChekbox);
        checkBoxbatman = findViewById(R.id.batmanChekbox);
        checkBoxsuperman = findViewById(R.id.superManChekbox);
        radiogroupitem = findViewById(R.id.radiogroupitem);
        radiogroupitem.setOnCheckedChangeListener(this);
        CheckBox[] all =  {checkboxjoker,checkBoxbatman,checkBoxsuperman};
        for (CheckBox one:all ) {
            one.setOnCheckedChangeListener(this);
            if(!one.isChecked()){
                Toast.makeText(this, "you need to watch "+ one.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        }



            Thread thethread = new Thread(new Runnable() {
                @Override
                public void run() {
                    setContentView(R.layout.activity_main);
                    ProgressBar progressbar;
                    progressbar = findViewById(R.id.progressbar);
                    for (int i= 0 ;i <11 ; i++ ){
                        System.out.println("progress = "+ i*10 + "%");
                        progressbar.incrementProgressBy(10);
                        if(progressbar.getProgress() >= 100){
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                   progressbar.setVisibility(View.GONE);
                                }
                        });
                    }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

thethread.start();
    }



}