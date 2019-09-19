package com.example.plantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecuContra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recu_contra);
    }
    public void siguiente(View view){
        Intent siguiente=new Intent(this,Login1.class);
        startActivity(siguiente);
    }
    public void siguiente2(View view){
        Intent siguiente1=new Intent(this,RecuContra2.class);
        startActivity(siguiente1);
    }
}
