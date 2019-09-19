package com.example.plantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class calabaza3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calabaza3);
    }
    public void siguiente(View view) {
        Intent siguiente = new Intent(this, calabaza2.class);
        startActivity(siguiente);
    }
}
