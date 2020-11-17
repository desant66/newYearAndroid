package com.example.pr56;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickPicturesButton(View view) {
        Intent intent = new Intent(MainActivity.this, activity_images.class);
        startActivity(intent);
    }
    public void onClickAboutButton(View view) {
        Intent intent = new Intent(MainActivity.this, activity_description.class);
        startActivity(intent);
    }
    public void onClickWhatButton(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "It is a trap!", Toast.LENGTH_SHORT);
        toast.show();
    }
}