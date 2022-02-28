package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Bad extends AppCompatActivity {

    Button Sad;
    Button Angry;
    Button Depressed;
    Button Suicidal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad);

        Sad = findViewById(R.id.btnOption4);
        Angry = findViewById(R.id.btnOption3);
        Depressed = findViewById(R.id.btnOption1);
        Suicidal = findViewById(R.id.btnOption2);

        Sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Sad.class));
            }
        });

        Angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), com.example.myapplication.Angry.class));
            }
        });

        Suicidal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), com.example.myapplication.Suicidal.class));
            }
        });

        Depressed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Depressed.class));
            }
        });

    }
}