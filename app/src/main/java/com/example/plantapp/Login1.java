package com.example.plantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

    }
    public void siguiente3(View view){
        Intent siguiente1=new Intent(this,Registro1.class);
        startActivity(siguiente1);
    }
    public void siguiente2(View view){
        Intent siguiente=new Intent(this,MainActivity.class);
        startActivity(siguiente);
    }
    public void siguiente(View view){
        Intent siguiente2=new Intent(this,RecuContra.class);
        startActivity(siguiente2);
    }
    public void siguiente5(View view){
        Intent siguiente4=new Intent(this,Planta.class);
        startActivity(siguiente4);
    }
}
