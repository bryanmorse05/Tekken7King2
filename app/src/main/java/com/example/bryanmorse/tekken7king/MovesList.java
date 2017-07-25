package com.example.bryanmorse.tekken7king;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MovesList extends AppCompatActivity {

    ArrayList<Moves> moves;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moves_list);

        RecyclerView movesRecyclerView = (RecyclerView) findViewById(R.id.movesRecyclerView);

        moves = Moves.createMovesList(0);
        moves.add(new Moves("Test", "lp", "lk", "rprk", "", "", "", "", "", "", ""));
        moves.add(new Moves("Test2", "right", "upleft", "", "", "", "n", "", "rplk", "", ""));
        moves.add(new Moves("Kent Face", "up", "up", "down", "down", "left", "right", "left", "right", "lp", "rp"));

        MoveListData adapter = new MoveListData(this, moves);

        movesRecyclerView.setAdapter(adapter);

        movesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
