package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class lab7_bai3 extends AppCompatActivity {
ImageView hourImg;
ImageView minuteImg;
ImageView secondImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab7_bai3);
        hourImg = findViewById(R.id.imageView3);
        minuteImg= findViewById(R.id.imageView4);
        secondImg = findViewById(R.id.imageView5);
        startclock();
    }
    public  void startclock()
    {
        Animation animationhour = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.hour);
        Animation animationminute = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.minute);
        Animation animationsecond = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.second);
        hourImg.startAnimation(animationhour);
        secondImg.startAnimation(animationsecond);
        minuteImg.startAnimation(animationminute);
    }
}