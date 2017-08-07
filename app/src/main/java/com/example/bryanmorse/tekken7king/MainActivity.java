package com.example.bryanmorse.tekken7king;

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

    public void openPunishesList(View view) {
        Intent intent = new Intent(this, PunishesList.class);
        startActivity(intent);
    }

    public void openCombosList(View view) {
        //Intent intent = new Intent(this, CombosList.class);
        //startActivity(intent);
    }

    public void openPokesList(View view) {
        //Intent intent = new Intent(this, PokesList.class);
        //startActivity(intent);
    }
}
