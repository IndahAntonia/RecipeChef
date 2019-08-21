package com.example.recipechef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Dasboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboard);
        final ImageView modern = findViewById(R.id.modern);
        final ImageView cake = findViewById(R.id.cake);
        final ImageView tradisional = findViewById(R.id.tradisional);
        modern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dasboard.this, MainActivity.class));
            }
        });

        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dasboard.this, Main2Activity2.class));
            }
        });

        tradisional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dasboard.this, Main2Activity3.class));
            }
        });

    }
}
