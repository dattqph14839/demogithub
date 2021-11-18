package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class lab7_2 extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab72);
    }

    public void all(View view) {
        imageView = findViewById(R.id.imageView6);
        imageView.setImageResource(R.drawable.all);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bai2);
        imageView.startAnimation(animation);
    }
    public void nobita(View view) {
        imageView = findViewById(R.id.imageView6);
        imageView.setImageResource(R.drawable.nobita);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bai2);
        imageView.startAnimation(animation);
    }
    public void doraemon(View view) {
        imageView = findViewById(R.id.imageView6);
        imageView.setImageResource(R.drawable.doraemon);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bai2);
        imageView.startAnimation(animation);
    }
}