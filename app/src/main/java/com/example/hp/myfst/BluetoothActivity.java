package com.example.hp.myfst;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class BluetoothActivity extends AppCompatActivity {

    private BluetoothAdapter bluetoothAdapter;    //本地蓝牙适配器

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    }
}
