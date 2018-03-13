package com.example.hp.myfst;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Image;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class NoteListActivity extends AppCompatActivity {

    private static final String Tag = "NoteListActivity";

//    声明一个button和textview
    Button mButton;
    TextView mTextView;
    Animation mFradein;
    SoundPool mSoundPool;
    int click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);

        Log.v(Tag, "NoteListActivity oncreate");
        Log.d(Tag, "NoteListActivity oncreate");
        Log.i(Tag, "NoteListActivity oncreate");
        Log.w(Tag, "NoteListActivity oncreate");
        Log.e(Tag, "NoteListActivity oncreate");

//        给mButton和mTextView赋值
        mButton = findViewById(R.id.button1);
        mTextView = findViewById(R.id.textview1);
        mFradein = AnimationUtils.loadAnimation(this, R.anim.fadein);
        mSoundPool =  new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        click = mSoundPool.load(this, R.raw.click, 1);

        mButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = "这是第一个android的开发程序";
                mTextView.setText(answer);
                mTextView.startAnimation(mFradein);
                playSound();
                toast("这是一个toast提示！");
            }
        });


    }

    private void toast(String content){
        Toast mToast = Toast.makeText(this, content, Toast.LENGTH_LONG);
        mToast.setGravity(Gravity.CENTER, 0, 0);
        mToast.show();
    }

    private void showDialog(){
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(this);
        mBuilder.setTitle("温馨提示");
        mBuilder.setMessage("确定退出？");
        mBuilder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                 dialogInterface.dismiss();
                 NoteListActivity.this.finish();
            }
        });
        mBuilder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        mBuilder.create().show();
    }

    @Override
    public void onBackPressed() {
        showDialog();
    }

    private void playSound(){
            mSoundPool.play(click,1, 1, 0, 0, 1 );
    }

    public void onNewNote(View view) {
//        启动新建页面
        Intent intent = new Intent(this,EditNoteActivity.class);

//        Bundle bundle = new Bundle();
//        intent.putExtras(bundle);
//
        startActivity(intent);
    }

    public void onReadNote(View view) {
        //        启动阅读页面
        Intent intent = new Intent(this,ReadNoteActivity.class);
        startActivity(intent);
    }
}
