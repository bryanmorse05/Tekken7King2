package com.example.bryanmorse.tekken7king;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MovesList extends Fragment {

    public MovesList() {
        //required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_moves_list, container, false);

        RecyclerView movesRecyclerView = view.findViewById(R.id.movesRecyclerView);

        MovesListAdapter adapter = new MovesListAdapter(view.getContext(), MainActivity.moves);

        movesRecyclerView.setAdapter(adapter);

        movesRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }
}
