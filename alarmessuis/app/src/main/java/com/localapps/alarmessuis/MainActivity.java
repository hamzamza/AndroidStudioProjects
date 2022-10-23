package com.localapps.alarmessuis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
private Button button ;
    private Calendar calendar = Calendar.getInstance() ;
    private DatePickerDialog.OnDateSetListener listner = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
         /* Toast.makeText(MainActivity.this, "your "+ i + "month  " + i2 , Toast.LENGTH_SHORT).show(); */
            calendar.set(Calendar.DAY_OF_MONTH, i2) ;
            calendar.set(Calendar.MONTH , i1 );
            calendar.set(Calendar.YEAR , i) ;
            String currentTime = new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime());
            button.setText( currentTime);
        }
    } ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.SET_ALARM) != PackageManager.PERMISSION_GRANTED);
        {ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.SET_ALARM },101);}
        setContentView(R.layout.activity_main);
button = findViewById(R.id.button);
        String currentTime = new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime());
        button.setText( currentTime);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
          /* Intent intent = new Intent(AlarmClock.ACTION_DISMISS_ALARM);
        intent.putExtra(AlarmClock.EXTRA_HOUR , 7);
        intent .putExtra(AlarmClock.EXTRA_MINUTES, 23);
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, "android intent category Lancher");
            startActivity(intent);
        Toast.makeText(MainActivity.this, "set alarm ", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"your current time is " +  currentTime, Toast.LENGTH_SHORT).show();*/
        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, listner , calendar.get(Calendar.YEAR) , calendar.get(Calendar.MONDAY), calendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
});

    }
}