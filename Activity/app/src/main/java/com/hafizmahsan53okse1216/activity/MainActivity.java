package com.hafizmahsan53okse1216.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static final String MSG = "com.hafizmahsan53okse1216.Order";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SendOrder(View view){

        Intent intent = new Intent(this, OrderActivity.class);

        EditText editText1 = findViewById(R.id.editTextTextPersonName2);
        EditText editText2 = findViewById(R.id.editTextTextPersonName3);

        String message = editText1.getText().toString() +"&"+ editText2.getText().toString();

        intent.putExtra(MSG,message);
        startActivity(intent);
    }
}