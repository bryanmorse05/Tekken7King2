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
        moves.add(new Moves("Punch", "Input 1"));
        moves.add(new Moves("Kick", "Input 2"));
        moves.add(new Moves("Throw", "Input 3"));

        MoveListData adapter = new MoveListData(this, moves);

        movesRecyclerView.setAdapter(adapter);

        movesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
