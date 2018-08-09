package com.example.semini.mad_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class HQ1incor1 extends AppCompatActivity {


    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hq1incor1);
        button1 = findViewById(R.id.buttonPlayAgain);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHQ1();
            }
        });
        button2 = findViewById(R.id.buttonQuit);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGM();
            }
        });
    }

    public void openHQ1(){
        Intent intent = new Intent(this, HQ1.class);
        startActivity(intent);
    }

    public void openGM(){
        Intent intent = new Intent(this, GameModes.class);
        startActivity(intent);
    }
}
