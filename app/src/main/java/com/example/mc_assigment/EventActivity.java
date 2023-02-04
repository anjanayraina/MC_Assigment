package com.example.mc_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.Toast;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        CheckBox ch1 = findViewById(R.id.checkbox1);
        CheckBox ch2 = findViewById(R.id.checkbox2);
        CheckBox ch3 = findViewById(R.id.checkbox3);
        CheckBox ch4 = findViewById(R.id.checkbox4);
        CheckBox ch5 = findViewById(R.id.checkbox5);

        RatingBar rating1  = findViewById(R.id.rating1);
        rating1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    float touchPositionX = event.getX();
                    float width = rating1.getWidth();

                    float starsf = (touchPositionX / width) * 5.0f;
                    int stars = (int)starsf + 1;
                    rating1.setRating(stars);


                    v.setPressed(false);
                }
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    v.setPressed(true);
                }

                if (event.getAction() == MotionEvent.ACTION_CANCEL) {
                    v.setPressed(false);
                }




                return true;
            }});

        RatingBar rating2  = findViewById(R.id.rating2);
        rating2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    float touchPositionX = event.getX();
                    float width = rating2.getWidth();

                    float starsf = (touchPositionX / width) * 5.0f;
                    int stars = (int)starsf + 1;
                    rating2.setRating(stars);


                    v.setPressed(false);
                }
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    v.setPressed(true);
                }

                if (event.getAction() == MotionEvent.ACTION_CANCEL) {
                    v.setPressed(false);
                }




                return true;
            }});

        RatingBar rating3  = findViewById(R.id.rating3);
        rating3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    float touchPositionX = event.getX();
                    float width = rating3.getWidth();

                    float starsf = (touchPositionX / width) * 5.0f;
                    int stars = (int)starsf + 1;
                    rating3.setRating(stars);


                    v.setPressed(false);
                }
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    v.setPressed(true);
                }

                if (event.getAction() == MotionEvent.ACTION_CANCEL) {
                    v.setPressed(false);
                }




                return true;
            }});

        RatingBar rating4  = findViewById(R.id.rating4);
        rating4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    float touchPositionX = event.getX();
                    float width = rating4.getWidth();

                    float starsf = (touchPositionX / width) * 5.0f;
                    int stars = (int)starsf + 1;
                    rating4.setRating(stars);


                    v.setPressed(false);
                }
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    v.setPressed(true);
                }

                if (event.getAction() == MotionEvent.ACTION_CANCEL) {
                    v.setPressed(false);
                }




                return true;
            }});

        RatingBar rating5  = findViewById(R.id.rating5);
        rating5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    float touchPositionX = event.getX();
                    float width = rating5.getWidth();

                    float starsf = (touchPositionX / width) * 5.0f;
                    int stars = (int)starsf + 1;
                    rating5.setRating(stars);


                    v.setPressed(false);
                }
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    v.setPressed(true);
                }

                if (event.getAction() == MotionEvent.ACTION_CANCEL) {
                    v.setPressed(false);
                }




                return true;
            }});

        Button next = (Button)findViewById(R.id.button2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EventActivity.this , EndActivity.class);
                startActivity(i);
            }
        });

        Button clear = (Button)findViewById(R.id.button3);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rating1.setRating(0);
                rating2.setRating(0);
                rating3.setRating(0);
                rating4.setRating(0);
                rating5.setRating(0);

                ch1.setChecked(false);
                ch2.setChecked(false);
                ch3.setChecked(false);
                ch4.setChecked(false);
                ch5.setChecked(false);

            }
        });
    }
}