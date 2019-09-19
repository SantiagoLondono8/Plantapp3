package com.example.plantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Firstact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstact);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent sigu=new Intent(Firstact.this,MainActivity.class);
                startActivity(sigu);

            }
        },4000);
    }

}
