package com.example.hp.myfst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReadNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_note);
    }

    public void onOpen(View view) {
        Intent intent  = new Intent(this, BluetoothActivity.class);
        startActivity(intent);
    }
}
