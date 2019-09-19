package com.example.plantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class zanahoria3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zanahoria3);
    }
    public void siguiente(View view) {
        Intent siguiente = new Intent(this, zanahoria2.class);
        startActivity(siguiente);
    }
}
