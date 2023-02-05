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
        t1 = (TextView) findViewById(R.id.textView5);
        t1.setText(t1.getText() + role);
        t1 = (TextView) findViewById(R.id.textView6);
        t1.setText(t1.getText() + (music.equals("-1") ? "Not Selected" : music));
        t1 = (TextView) findViewById(R.id.textView7);
        t1.setText(t1.getText() + (dance.equals("-1") ? "Not Selected" : dance));
        t1 = (TextView) findViewById(R.id.textView8);
        t1.setText(t1.getText() + (play.equals("-1") ? "Not Selected" : play));
        t1 = (TextView) findViewById(R.id.textView9);
        t1.setText(t1.getText() + (fasion.equals("-1") ? "not Selected" : fasion));
        t1 = (TextView) findViewById(R.id.textView10);
        t1.setText(t1.getText() + (food.equals("-1") ? "Not Selected" : food));
    }
}