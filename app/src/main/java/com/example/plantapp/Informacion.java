package com.example.plantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
    }
    public void siguiente(View view){
        Intent siguiente1=new Intent(this,MainActivity.class);
        startActivity(siguiente1);
    }
}
