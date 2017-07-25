package com.example.bryanmorse.tekken7king;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMovesList(View view) {
        Intent intent = new Intent(this, MovesList.class);
        startActivity(intent);
        //Notes
    }
}
