package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bai1(View v ){
        Intent intent = new Intent(MainActivity.this,lab7_bai1.class);
        startActivity(intent);
    }

    public void bai3(View view) {
        Intent intent = new Intent(MainActivity.this,lab7_bai3.class);
        startActivity(intent);
    }
    public void bai2(View view) {
        Intent intent = new Intent(MainActivity.this,lab7_2.class);
        startActivity(intent);
    }
}