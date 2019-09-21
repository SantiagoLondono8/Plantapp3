package com.example.plantapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Set;

public class HumedadP extends AppCompatActivity {
    private static final int REQUEST_ENABLE_BT =0;
    private static final int REQUEST_DISCOVER_BT =1;

    BluetoothAdapter blue1;
    Button BlueBtn, BlueoffBtn;
    Button discovertn, pairedbtn;
    TextView pairedTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humedad_p);
    BlueBtn = findViewById(R.id.onbtn);
    discovertn = findViewById(R.id.discoverBtn2);
    BlueoffBtn = findViewById(R.id.offbtn);
    pairedbtn = findViewById(R.id.pairedDev);
    pairedTv = findViewById(R.id.TvPairedDevices);

    BlueBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!blue1.isEnabled()){
                showToast("Encendiendo bluetooth... ");
                Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(intent, REQUEST_ENABLE_BT);
            }
            else {
                showToast("Bluetooth ya esta encendido");

            }
        }


    }


    );
    discovertn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!blue1.isDiscovering()){
                showToast("Reconociendo Sensor");
                Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                startActivityForResult(intent, REQUEST_DISCOVER_BT);
            }
            else {
                showToast("Bluetooth ya esta encendido");

            }
        }
    });
    BlueoffBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (blue1.isEnabled()){
                blue1.disable();
                showToast("Apagando Bluetooth");

            }
            else {
                showToast("Bluetotth ya esta apagado");
            }
        }
    });
    pairedbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (blue1.isEnabled()){
                pairedTv.setText("Dispositivos Emparejado");
                Set<BluetoothDevice> devices=blue1.getBondedDevices();
                for (BluetoothDevice device:devices){
                    pairedTv.append("");
                }
            }
        }
    });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode){
            case REQUEST_ENABLE_BT:
                if (resultCode== RESULT_OK){
                    showToast("Bluetooth is on");
                }
                else{
                    showToast("No se pudo conectar Bluetooth");
                }
                break;
        }
        super.onActivityResult(requestCode, resultCode, data);

    }

    private void showToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
