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
        moves.add(new Moves("Rage Art", "downright", "lprp", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Palm Strike to Head Jammer", "lp", "rp", "rprk", "", "", "", "", "", "", ""));
        moves.add(new Moves("Palm Strike to Jumping Power Bomb", "lp", "rp", "down", "rprk", "", "", "", "", "", ""));
        moves.add(new Moves("Palm Attack to Uppercut", "lp", "rp", "lp", "", "", "", "", "", "", ""));
        moves.add(new Moves("Palm Upper to Suplex", "lp", "rp", "lp", "rprk", "", "", "", "", "", ""));
        moves.add(new Moves("Palm Upper to Jumping Power Bomb", "lp", "rp", "lp", "down", "rprk", "", "", "", "", ""));
        moves.add(new Moves("Jab Uppercut", "rp", "lp", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Head Spinner", "lprp", "lp", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Brutal Sting (S)", "lprp", "lk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Jaguar Step", "lkrk", "", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Reverse Jaguar Step", "left", "lkrk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Jaguar Step to Hook", "lkrk", "lp", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Jaguar Step to Elbow", "lkrk", "rp", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Jaguar Step to Sobat", "lkrk", "lk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Jaguar Step to Sobat & Press", "lkrk", "lk", "rplk", "", "", "", "", "", "", ""));
        moves.add(new Moves("Jaguar Step to High Kick", "lkrk", "rk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Jaguar Step to Mid Kick", "lkrk", "downright", "rk", "", "", "", "", "", "", ""));
        moves.add(new Moves("Moonsault Body Press (Unblockable)", "lprk", "", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Elbow Impact", "right", "rp", "lp", "", "", "", "", "", "", ""));
        moves.add(new Moves("Jaguar Smash Combo", "right", "rp", "down", "lp", "rp", "", "", "", "", ""));
        moves.add(new Moves("Front Kick", "right", "lk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Front Kick to DDT", "right", "lk", "lprp", "", "", "", "", "", "", ""));
        moves.add(new Moves("Rolling Sobat (Homing)", "right", "rk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Shadow Lariat", "right", "lprp", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Jaguar Lariat (Hold)", "right", "lprp", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Exploder", "right", "lkrk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Body Check", "right", "lprk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Shoulder Tackle (Power Crush)", "right", "rplk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Elbow Sting", "downright", "lp", "rp", "", "", "", "", "", "", ""));
        moves.add(new Moves("Double Hook Disaster (Tailspin)", "downright", "rp", "lp", "", "", "", "", "", "", ""));
        moves.add(new Moves("Lasso Kick", "downright", "lk", "rk", "", "", "", "", "", "", ""));
        moves.add(new Moves("Mincer", "downright", "rk", "lk", "rk", "", "", "", "", "", ""));
        moves.add(new Moves("Mincer Low", "downright", "rk", "lk", "down", "rk", "", "", "", "", ""));
        moves.add(new Moves("Frankensteiner", "downright", "lkrk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Jab Uppercut", "down", "lp", "rp", "", "", "", "", "", "", ""));
        moves.add(new Moves("Stomp", "down", "lk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Atlas' Hammer", "down", "lprp", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Stagger Kick", "down", "lkrk", "rk", "rk", "", "", "", "", "", ""));
        moves.add(new Moves("Stagger Kicks (During Counter)", "down", "lkrk", "rk", "rk", "rk", "", "", "", "", ""));
        moves.add(new Moves("Stagger Kick Spinning Uppercut (During Stagger Kick)", "rp", "", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Corporate Elbow", "down", "rplk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Brain Chop", "downleft", "rp", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Crouching Low Kick", "downleft", "lk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Low Drop Kick", "downleft", "rk", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Quick Hook", "left", "lp", "", "", "", "", "", "", "", ""));
        moves.add(new Moves("Quick Hook Uppercut", "left", "lp", "rp", "", "", "", "", "", "", ""));
        moves.add(new Moves("Quick Hook Heel Kick", "left", "lp", "rk", "", "", "", "", "", "", ""));
        moves.add(new Moves("Chupacabra to Head Butt", "left", "rp", "lprp", "", "", "", "", "", "", ""));
        moves.add(new Moves("Chupacabra to Toe Kick", "left", "rp", "rk", "", "", "", "", "", "", ""));
        moves.add(new Moves("Olympia Slam (During Counter)", "left", "rp", "rk", "", "", "", "", "", "", ""));

        MoveListAdapter adapter = new MoveListAdapter(this, moves);

        movesRecyclerView.setAdapter(adapter);

        movesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
