package com.example.seekbartable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    ListView listView ;
    SeekBar seekbar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textview = findViewById(R.id.textView);
         listView = findViewById(R.id.listview);
         seekbar = findViewById(R.id.seekBar);

         seekbar.setMax(10);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(MainActivity.this, "Populating Table of "+ i, Toast.LENGTH_SHORT).show();
                populate(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
        public void populate(int table) {
            ArrayList<String> mgTable = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                mgTable.add(table + " * " + i + " = "+ table*i);
            }
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,mgTable);
            listView.setAdapter(arrayAdapter);
            textview.setText("Magic Table is of :" + table);
        }
        }
