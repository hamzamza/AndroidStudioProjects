package com.localApps.loginApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "this is a custom tag";
    private Spinner spinner ;
private ImageView image;
private Button btnUpload , btnRegister;
private EditText username, email, password , password2;
private RadioGroup gender ;
private CheckBox agree;
private RadioButton gendertype ;
private TextView requsername, reqemail, reqpassword, reqpassword2 ;
private  ArrayList<EditText> editTexts = new ArrayList<>();
private ArrayList<TextView>  requirements = new ArrayList<>();
private ConstraintLayout parent ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parent = findViewById(R.id.parent);
        spinner = findViewById(R.id.countryspinner);
        ArrayList<String> cities = new ArrayList<>();
        cities.add("agadir");
        cities.add("taroudant");
        cities.add("aoulouz");
        cities.add("taliouin");
        cities.add("ouarzazat");
        cities.add("lfid");
        // params
         // params // required red params
        requsername =  findViewById(R.id.namereq);
        reqemail=findViewById(R.id.emailreq);
        reqpassword=findViewById(R.id.passwordreq);
        reqpassword2= findViewById(R.id.passw2req);

        requirements.add(requsername);
        requirements.add(reqemail);
        requirements.add(reqpassword);
        requirements.add(reqpassword2);

        editTexts.add(username);
        editTexts.add(email);
        editTexts.add(password );
        editTexts.add( password2);
// other elements
        image = findViewById(R.id.image);
        btnUpload  = findViewById(R.id.addimage);
        btnRegister = findViewById(R.id.register);
        username = findViewById(R.id.username);
        email = findViewById( R.id.email);
        password = findViewById(R.id.password);
        password2   = findViewById(R.id.password2);
        gender = findViewById(R.id.gender);
        agree = findViewById(R.id.isAgree);
        gendertype = findViewById(R.id.genderradio);

        // end params

        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "yet to talk about", Toast.LENGTH_SHORT).show();

            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requsername.setVisibility(View.GONE);
                reqemail.setVisibility(View.GONE);
                reqpassword.setVisibility(View.GONE);
                reqpassword2.setVisibility(View.GONE);

                initRegister();
            }
        });


        ArrayAdapter<String> addpater = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,cities);
        spinner.setAdapter(addpater);
    }
    private void initRegister(){
        Log.d(TAG, "initRegister: started ");
if(validateData()){
    if(agreementChecked()){
        showSnackbar(parent);
    }
  else  Toast.makeText(this, "you need to check agreement checkbox", Toast.LENGTH_SHORT).show();
}
}
private Boolean  validateData(){

        boolean isAnyOneempty=false;
        // requsername, reqemail, reqpassword, reqpassword2
    if(username.getText().toString().equals("")){
        isAnyOneempty = true;
requsername.setVisibility(View.VISIBLE);
    }
    if(email.getText().toString().equals("")){ isAnyOneempty = true;
        reqemail.setVisibility(View.VISIBLE);}
    if(password.getText().toString().equals("")){ isAnyOneempty = true;
        reqpassword.setVisibility(View.VISIBLE);}

    if(password2.getText().toString().equals("") ||  !password2.getText().toString().equals(password.getText().toString())  ){
        isAnyOneempty = true;
        reqpassword2.setVisibility(View.VISIBLE);
    }
   return !isAnyOneempty;
}
private Boolean agreementChecked(){
       return agree.isChecked();
}
private void showSnackbar(View parent){
 Snackbar.make(parent,"user Register ", Snackbar.LENGTH_INDEFINITE).setAction("dismiss", new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         requsername.setVisibility(View.GONE);
         reqemail.setVisibility(View.GONE);
         reqpassword.setVisibility(View.GONE);
         reqpassword2.setVisibility(View.GONE);

     }
 }).show();
}
}
