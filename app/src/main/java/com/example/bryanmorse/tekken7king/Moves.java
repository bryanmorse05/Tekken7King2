package com.example.bryanmorse.tekken7king;

import java.util.ArrayList;

/**
 * Created by bryanmorse on 7/17/17.
 */

public class Moves {

    private String mName;
    private String firstInput;
    private String secondInput;
    private String thirdInput;
    private String fourthInput;
    private String fifthInput;
    private String sixthInput;
    private String seventhInput;
    private String eighthInput;
    private String ninthInput;
    private String tenthInput;

    private boolean checkboxState;

    public Moves(String name, String input1, String input2, String input3, String input4, String input5,
                 String input6, String input7, String input8, String input9, String input10, boolean cbState) {
        mName = name;
        firstInput = input1;
        secondInput = input2;
        thirdInput = input3;
        fourthInput = input4;
        fifthInput = input5;
        sixthInput = input6;
        seventhInput = input7;
        eighthInput = input8;
        ninthInput = input9;
        tenthInput = input10;
        checkboxState = cbState;
    }

    public String getName() { return mName; }

    public String getFirstInput() { return firstInput; }

    public String getSecondInput() { return secondInput; }

    public String getThirdInput() { return thirdInput; }

    public String getFourthInput() { return fourthInput; }

    public String getFifthInput() { return fifthInput; }

    public String getSixthInput() { return sixthInput; }

    public String getSeventhInput() { return seventhInput; }

    public String getEighthInput() { return eighthInput; }

    public String getNinthInput() { return ninthInput; }

    public String getTenthInput() { return tenthInput; }

    public boolean getCheckboxState() { return checkboxState; }

    public void setCheckboxState(boolean checkboxState) {
        this.checkboxState = checkboxState;
    }

    public static ArrayList<Moves> createMovesList(int numMoves) {
       //int nMoves = 0;

        for (int i = 1; i <= numMoves; i++) {
            MainActivity.moves.add(new Moves("Move Name", "lp", "rp", "lk", "rk", "lprp", "lkrk", "lplk", "rprk", "right", "left", false));
            MainActivity.favoriteMoves.add(new Moves("Move Name", "lp", "rp", "lk", "rk", "lprp", "lkrk", "lplk", "rprk", "right", "left", false));
        }

        return MainActivity.moves;
    }
}
