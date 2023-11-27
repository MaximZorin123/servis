package com.example.musicshop;

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

    public void listen(View v) {
        Intent i = new Intent(this, MediaService.class);
        if (v.getId() == R.id.play) {
            startService(i);
        } else {
            stopService(i);
        }
    }
}