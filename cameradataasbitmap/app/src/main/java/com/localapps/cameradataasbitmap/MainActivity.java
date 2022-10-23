package com.localapps.cameradataasbitmap;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private final int CAMERA_REQUEST = 1001 ;
    private final int CAMERA_PERSMISSION_REQUEST = 1002 ;
private final int PERMISSION_REQUEST_CODE = 1003;
private Button camerabtn ;
private ImageView imageview ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            camerabtn = findViewById(R.id.opencamerabtn);
            imageview = findViewById(R.id.imageView);
            if(ActivityCompat.checkSelfPermission(this,Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CAMERA} , CAMERA_PERSMISSION_REQUEST );
            }


                camerabtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       handelpersmissions(v);
                    }

                });
    }

    private void OpenCamera() {
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        //noinspection deprecation
        startActivityForResult(cameraIntent, CAMERA_REQUEST);
    }

    private void showSnackbar(View view) {

Snackbar.make( view ,"this app needs the camera permissions " , Snackbar.LENGTH_INDEFINITE)
        .setAction( "Granat permission ", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        System.out.println(getPackageName());
        intent.setData(Uri.parse("package:" + getPackageName()));
startActivityForResult(intent,PERMISSION_REQUEST_CODE);
            }
        }).setAction("canel", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " 9wed ka", Toast.LENGTH_SHORT).show();
            }
        }).show();
    }
private void handelpersmissions(View v){
    if(ActivityCompat.checkSelfPermission(MainActivity.this,Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
        OpenCamera();}
    else{
        if(ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this, Manifest.permission.CAMERA)){
            Toast.makeText(MainActivity.this, "u need camera permission", Toast.LENGTH_SHORT).show();
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CAMERA}, CAMERA_PERSMISSION_REQUEST);
        }
        else {  showSnackbar(v);
        }}
}

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults.length> 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED ){
            OpenCamera();
        }
        else{

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode)
        { case CAMERA_REQUEST:
            if(resultCode == RESULT_OK && data != null)
            {
                Bundle  bundle = data.getExtras();
                if(bundle != null){
                    Bitmap bitmap = (Bitmap) bundle.get("data");
                    Glide
                            .with(this)
                            .asBitmap()
                            .load(bitmap)
                            .into(imageview);
                }
            }
            break;
            case PERMISSION_REQUEST_CODE:

                break;
            default:
                break;

        }
    }
}