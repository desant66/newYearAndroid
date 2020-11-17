package com.example.pr56;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_images extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
    }
    public void onClickBackButton(View view) {
        Intent intent = new Intent( activity_images.this, MainActivity.class);
        startActivity(intent);
    }
}