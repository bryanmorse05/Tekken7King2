package com.example.bryanmorse.tekken7king;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import java.util.ArrayList;

public class MovesTabs extends AppCompatActivity {

    TabLayout tabLayout;
    FrameLayout simpleFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moves_tabs);

        simpleFrameLayout = (FrameLayout) findViewById(R.id.movesSimpleFrameLayout);
        tabLayout = (TabLayout) findViewById(R.id.movesTabLayout);


        //No longer need to call createMovesList because the arrays are being created above now
        //MovesTabs.moves = Moves.createMovesList(0);
        //MovesTabs.favoriteMoves = Moves.createMovesList(0);

        //Display the Moves List first
        Fragment startingFragment = new MovesList();
        FragmentManager sfm = getSupportFragmentManager();
        FragmentTransaction sft = sfm.beginTransaction();
        sft.replace(R.id.movesSimpleFrameLayout, startingFragment);
        sft.commit();

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new MovesList();
                        break;
                    case 1:
                        fragment = new MovesFavorites();
                        break;
                }

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.movesSimpleFrameLayout, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) { }

            @Override
            public void onTabReselected(TabLayout.Tab tab) { }
        });
    }
}
