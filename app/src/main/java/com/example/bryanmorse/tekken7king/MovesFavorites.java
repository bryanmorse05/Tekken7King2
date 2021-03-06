package com.example.bryanmorse.tekken7king;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MovesFavorites extends Fragment {

    //ArrayList<Moves> favoriteMoves;

    public MovesFavorites() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_moves_favorites, container, false);

        RecyclerView movesRecyclerView = view.findViewById(R.id.movesFavoritesRecyclerView);

        //MovesTabs.favoriteMoves = Moves.createMovesList(0);

        MovesFavoritesAdapter adapter = new MovesFavoritesAdapter(view.getContext(), MainActivity.favoriteMoves);

        movesRecyclerView.setAdapter(adapter);

        movesRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }
}