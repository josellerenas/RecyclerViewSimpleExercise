package com.example.recyclerviewexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Declaring the variables
    private Button btnPressMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing the variables
        btnPressMe = findViewById(R.id.btnPressMe);

        // OnClickListener for the button, to go to another Activity
        btnPressMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayElementsActivity.class);
                startActivity(intent);
            }
        });
    }
}