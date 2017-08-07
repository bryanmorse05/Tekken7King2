package com.example.bryanmorse.tekken7king;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class PunishesList extends AppCompatActivity {

    ArrayList<Moves> punishes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moves_list);

        RecyclerView movesRecyclerView = (RecyclerView) findViewById(R.id.movesRecyclerView);

        punishes = Moves.createMovesList(0);
        punishes.add(new Moves("Rage Art", "downright", "lprp", "", "", "", "", "", "", "", "", false));
        punishes.add(new Moves("Palm Strike to Head Jammer", "lp", "rp", "rprk", "", "", "", "", "", "", "", false));


        MoveListAdapter adapter = new MoveListAdapter(this, punishes);

        movesRecyclerView.setAdapter(adapter);

        movesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
