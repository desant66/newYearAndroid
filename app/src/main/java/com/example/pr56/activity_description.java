package com.example.pr56;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class activity_description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        ImageView santaClaus=findViewById(R.id.santaClaus);
        Animation flight= AnimationUtils.loadAnimation(this,R.anim.animation_flight);
        santaClaus.startAnimation(flight);
    }
    public void onClickBackButton(View view) {
        Intent intent = new Intent( activity_description.this, MainActivity.class);
        startActivity(intent);
    }
}