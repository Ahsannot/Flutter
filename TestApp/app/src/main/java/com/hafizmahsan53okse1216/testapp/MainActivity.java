package com.hafizmahsan53okse1216.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void sendNow(View view){
        Toast.makeText(this, "Sending message ...", Toast.LENGTH_SHORT).show();
    }
    public void receiveNow(View view){
        Toast.makeText(this, "Receiving message ...", Toast.LENGTH_SHORT).show();
    }
    public void closeNow(View view){
        Toast.makeText(this, "Closing App ...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}