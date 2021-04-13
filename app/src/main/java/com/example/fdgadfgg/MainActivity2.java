package com.example.fdgadfgg;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {

    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
Button bttn1=(Button)findViewById(R.id.button);
        song=new MediaPlayer();

        song=MediaPlayer.create(MainActivity2.this,R.raw.track2);

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                song.start();
            }
        };

        Timer open=new Timer();


        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open.schedule(task,5000);
            }
        });


    }
}