package com.example.semini.mad_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class GameModes extends AppCompatActivity {


    private ImageButton button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_modes);

        button1 = findViewById(R.id.imageButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHQ1();
            }
        });


    }






    public void openHQ1(){
        Intent intent = new Intent(this, HQ1.class);
        startActivity(intent);
    }
}
