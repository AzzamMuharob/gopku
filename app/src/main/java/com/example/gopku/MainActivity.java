package com.example.gopku;

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

    public void methodRS(View view) {
        Intent i = new Intent(this, RS.class);
        startActivity(i);
    }

    public void methodPS(View view) {
        Intent i = new Intent(this,PoliceStation.class);
        startActivity(i);
    }

    public void methodSM(View view) {
        Intent i = new Intent(this,SuperMarket.class);
        startActivity(i);
    }

    public void methodSC(View view) {
        Intent i = new Intent(this,School.class);
        startActivity(i);
    }
}