package com.example.hp.myfst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EditNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);
    }

    public void onEditFinish(View view) {
//        保存页面
        Toast.makeText(this,"笔记未保存",Toast.LENGTH_SHORT).show();
//        关闭页面
        finish();
    }
}
