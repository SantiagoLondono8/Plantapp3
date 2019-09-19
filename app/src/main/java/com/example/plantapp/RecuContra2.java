package com.example.plantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecuContra2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recu_contra2);
    }
    public void siguiente(View view){
        Intent siguiente=new Intent(this,RecuContra.class);
        startActivity(siguiente);
    }
    public void siguiente1(View view){
        Intent siguiente2=new Intent(this,RecuContra3.class);
        startActivity(siguiente2);
    }
}
