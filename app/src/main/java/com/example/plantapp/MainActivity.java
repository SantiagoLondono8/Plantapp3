package com.example.plantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void siguiente1(View view){
        Intent siguiente=new Intent(this,Login1.class);
        startActivity(siguiente);
    }
    public void siguiente2(View view){
        Intent siguiente1=new Intent(this,Registro1.class);
        startActivity(siguiente1);
    }
    public void siguiente3(View view){
        Intent siguiente2=new Intent(this,Informacion.class);
        startActivity(siguiente2);
    }
}
