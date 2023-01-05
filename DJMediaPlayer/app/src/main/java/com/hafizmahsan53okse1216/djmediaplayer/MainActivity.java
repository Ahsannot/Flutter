package com.hafizmahsan53okse1216.djmediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Button btnStart, btnStop, btnPause;
        btnStart = findViewById(R.id.start);
        btnStop = findViewById(R.id.stop);
        btnPause = findViewById(R.id.pause);

        MediaPlayer mp = new MediaPlayer();
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);

        String aPath = "android.resource://"+getPackageName()+"/raw/kawsar";
        try {
           Uri uri = Uri.parse(aPath);
            mp.setDataSource(this,uri);

           // mp.setDataSource(aPath);
            mp.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mp.pause();
            }
        });
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
                mp.seekTo(0);
            }
        });
    }
}