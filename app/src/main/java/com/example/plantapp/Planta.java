package com.example.plantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Planta extends AppCompatActivity {

    public Spinner spinner00;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planta);

        spinner00 = (Spinner) findViewById(R.id.spinner0);

        String [] Opciones = {"Zanahoria", "Calabaza", "Maiz", "Orquidea"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Opciones);
        spinner00.setAdapter(adapter);

    }

    public void calculospi(View view){
        String seleccion = spinner00.getSelectedItem().toString();
        if (seleccion.equals("Zanahoria")){
            Intent siguiente1=new Intent(this,zanahoria1.class);
            startActivity(siguiente1);
        }
        if (seleccion.equals("Calabaza")){
            Intent siguiente1=new Intent(this,calabaza1.class);
            startActivity(siguiente1);
        }
        if (seleccion.equals("Maiz")){
            Intent siguiente1=new Intent(this,maiz1.class);
            startActivity(siguiente1);
        }
        if (seleccion.equals("Orquidea")){
            Intent siguiente1=new Intent(this,orquidia1.class);
            startActivity(siguiente1);
        }


    }
    public void isensor(View view){
        Toast.makeText(this, "Inserte el sensor en la tierra debajo de la planta", Toast.LENGTH_LONG).show();
    }
    public void siguiente(View view){
        Intent siguiente1=new Intent(this,HumedadP.class);
        startActivity(siguiente1);
    }
}
