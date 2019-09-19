package com.example.plantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class orquidea4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orquidea4);
    }
    public void siguiente(View view) {
        Intent siguiente = new Intent(this, orquidea3.class);
        startActivity(siguiente);
    }
}
