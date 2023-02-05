package com.example.mc_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        String name = getIntent().getStringExtra("name");
        String role = getIntent().getStringExtra("role");
        String dance = getIntent().getStringExtra("dance");
        String music = getIntent().getStringExtra("music");
        String play = getIntent().getStringExtra("play");
        String fasion = getIntent().getStringExtra("fasion");
        String food = getIntent().getStringExtra("food");
        TextView t1 = (TextView) findViewById(R.id.textView4);
        t1.setText(t1.getText() + name);

    }
}