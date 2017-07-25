package com.example.bryanmorse.tekken7king;

import java.util.ArrayList;

/**
 * Created by bryanmorse on 7/17/17.
 */

public class Moves {

    private String mName;
    private String mInput;

    public Moves(String name, String input) {
        mName = name;
        mInput = input;
    }

    public String getName() { return mName; }

    public String getInput() { return mInput; }

    public static ArrayList<Moves> createMovesList(int numMoves) {
        ArrayList<Moves> moves = new ArrayList<>();

        int nMoves = 0;

        for (int i = 1; i <= numMoves; i++) {
            moves.add(new Moves("Move " + ++nMoves, "Input " + nMoves));
        }

        return moves;
    }
}
