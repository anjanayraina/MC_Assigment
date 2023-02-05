package com.example.mc_assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        Button nextButton = (Button)findViewById(R.id.button);
        TextView name = (TextView)findViewById(R.id.textView);
        TextView role = (TextView)findViewById(R.id.textView2) ;
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainScreen.this , EventActivity.class);
                i.putExtra("name" , name.getText().toString());
                i.putExtra("role" , role.getText().toString());
                startActivity(i);
            }
        });
    }
}