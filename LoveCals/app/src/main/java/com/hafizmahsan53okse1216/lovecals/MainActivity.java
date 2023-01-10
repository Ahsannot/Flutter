package com.hafizmahsan53okse1216.lovecals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
    }

    //EditText male, female;
    TextView tv ;
    String result;

    public void showResult(View view){
        EditText male = findViewById(R.id.editTextTextPersonName);
        EditText female = findViewById(R.id.editTextTextPersonName2);
        TextView tv = findViewById(R.id.textView);

        String m = male.getText().toString();
        String f = female.getText().toString();

        String sum = m+f;
        sum = sum.toLowerCase(Locale.ROOT);

        int value = sum.hashCode();

        Random random = new Random(value);

        result = "Couple Love is "+(random.nextInt(100)+1)+"%";
        if (f.equals("") && m.equals(""))
        {
            Toast.makeText(this, "Enter Name To Calculate Love ...", Toast.LENGTH_SHORT).show();
        }
        else {
            tv.setText(result);
        }

    }
}