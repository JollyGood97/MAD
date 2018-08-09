package com.example.semini.mad_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class HQ1 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hq1);

        button1 = findViewById(R.id.buttonAxe);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIncorrect1();
            }
        });
        button2 = findViewById(R.id.score);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCorrect1();
            }
        });
        button3 = findViewById(R.id.buttonbb);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIncorrect3();
            }
        });
        button4 = findViewById(R.id.buttonBeast);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIncorrect4();
            }
        });
    }

    public void openIncorrect1(){
        Intent intent = new Intent(this, HQ1incor1.class);
    startActivity(intent);
    }
    public void openCorrect1(){
        Intent intent = new Intent(this, HQ1cor1.class);
        startActivity(intent);
    }
    public void openIncorrect3(){
        Intent intent = new Intent(this, HQ1incor1.class);
        startActivity(intent);
    }
    public void openIncorrect4(){
        Intent intent = new Intent(this, HQ1incor1.class);
        startActivity(intent);
    }
}
