package com.example.bryanmorse.tekken7king;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MovesFavoritesAdapter extends RecyclerView.Adapter<MovesFavoritesAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView moveName;

        public ImageView firstInput;
        public ImageView secondInput;
        public ImageView thirdInput;
        public ImageView fourthInput;
        public ImageView fifthInput;
        public ImageView sixthInput;
        public ImageView seventhInput;
        public ImageView eighthInput;
        public ImageView ninthInput;
        public ImageView tenthInput;

        public CheckBox favoriteCheckbox;


        public ViewHolder(View itemView) {

            super(itemView);

            moveName = itemView.findViewById(R.id.moveName);
            firstInput = itemView.findViewById(R.id.firstInput);
            secondInput = itemView.findViewById(R.id.secondInput);
            thirdInput = itemView.findViewById(R.id.thirdInput);
            fourthInput = itemView.findViewById(R.id.fourthInput);
            fifthInput = itemView.findViewById(R.id.fifthInput);
            sixthInput = itemView.findViewById(R.id.sixthInput);
            seventhInput = itemView.findViewById(R.id.seventhInput);
            eighthInput = itemView.findViewById(R.id.eighthInput);
            ninthInput = itemView.findViewById(R.id.ninthInput);
            tenthInput = itemView.findViewById(R.id.tenthInput);

            favoriteCheckbox = itemView.findViewById(R.id.favoriteMoveButton);
        }
    }

    private List<Moves> mMoves;

    private Context mContext;

    public MovesFavoritesAdapter(Context context, List<Moves> moves) {
        mMoves = moves;
        mContext = context;
    }

    private Context getContext() { return mContext; }

    @Override
    public MovesFavoritesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View movesView = inflater.inflate(R.layout.activity_move_list_data, parent, false);

        ViewHolder viewHolder = new ViewHolder(movesView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MovesFavoritesAdapter.ViewHolder viewHolder, int position) {

        final Moves moves = mMoves.get(position);

            //Set move name
            TextView textView = viewHolder.moveName;
            textView.setText(moves.getName());

            //Setting images in the command list
            ImageView firstInput = viewHolder.firstInput;
            int resIdOne = sortingThroughInputCommands(moves.getFirstInput());
            firstInput.setImageResource(resIdOne);

            ImageView secondInput = viewHolder.secondInput;
            int resIdTwo = sortingThroughInputCommands(moves.getSecondInput());
            secondInput.setImageResource(resIdTwo);

            ImageView thirdInput = viewHolder.thirdInput;
            int resIdThree = sortingThroughInputCommands(moves.getThirdInput());
            thirdInput.setImageResource(resIdThree);

            ImageView fourthInput = viewHolder.fourthInput;
            int resIdFour = sortingThroughInputCommands(moves.getFourthInput());
            fourthInput.setImageResource(resIdFour);

            ImageView fifthInput = viewHolder.fifthInput;
            int resIdFive = sortingThroughInputCommands(moves.getFifthInput());
            fifthInput.setImageResource(resIdFive);

            ImageView sixthInput = viewHolder.sixthInput;
            int resIdSix = sortingThroughInputCommands(moves.getSixthInput());
            sixthInput.setImageResource(resIdSix);

            ImageView seventhInput = viewHolder.seventhInput;
            int resIdSeven = sortingThroughInputCommands(moves.getSeventhInput());
            seventhInput.setImageResource(resIdSeven);

            ImageView eighthInput = viewHolder.eighthInput;
            int resIdEight = sortingThroughInputCommands(moves.getEighthInput());
            eighthInput.setImageResource(resIdEight);

            ImageView ninthInput = viewHolder.ninthInput;
            int resIdNine = sortingThroughInputCommands(moves.getNinthInput());
            ninthInput.setImageResource(resIdNine);

            ImageView tenthInput = viewHolder.tenthInput;
            int resIdTen = sortingThroughInputCommands(moves.getTenthInput());
            tenthInput.setImageResource(resIdTen);


            SharedPreferences sharedPreferences = getContext().getSharedPreferences("Tekken7KingSaveData", Context.MODE_PRIVATE);
            final SharedPreferences.Editor editor = sharedPreferences.edit(); //access the file

            viewHolder.favoriteCheckbox.setOnCheckedChangeListener(null);

            viewHolder.favoriteCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    //editor.remove(moves.getName());
                    Log.d(moves.getName(), "REMOVED");

                    //editor.apply();
                    //MovesTabs.favoriteMoves.remove();
                }
            });

            viewHolder.favoriteCheckbox.setChecked(true);
        }



        //Setting the favorite checkbox

        //checkBox.setChecked(moves.getCheckboxState());

        //SharedPreferences sharedPreferences = getContext().getSharedPreferences("Tekken7KingSaveData", Context.MODE_PRIVATE);
        //final SharedPreferences.Editor editor = sharedPreferences.edit(); //access the file

        //Load the save data


    @Override
    public int getItemCount() { return mMoves.size(); }

    public int sortingThroughInputCommands(String inputCommand) {
        int commandId = 0;
        if (inputCommand.equals("lp"))
        {
            commandId = R.drawable.lp;
        }
        else if (inputCommand.equals("rp"))
        {
            commandId = R.drawable.rp;
        }
        else if (inputCommand.equals("lk"))
        {
            commandId = R.drawable.lk;
        }
        else if (inputCommand.equals("rk"))
        {
            commandId = R.drawable.rk;
        }
        else if (inputCommand.equals("lprp"))
        {
            commandId = R.drawable.lprp;
        }
        else if (inputCommand.equals("lkrk"))
        {
            commandId = R.drawable.lkrk;
        }
        else if (inputCommand.equals("lplk"))
        {
            commandId = R.drawable.lplk;
        }
        else if (inputCommand.equals("rprk"))
        {
            commandId = R.drawable.rprk;
        }
        else if (inputCommand.equals("lprk"))
        {
            commandId = R.drawable.lprk;
        }
        else if (inputCommand.equals("rplk"))
        {
            commandId = R.drawable.rplk;
        }
        else if (inputCommand.equals("lprplk"))
        {
            commandId = R.drawable.lprplk;
        }
        else if (inputCommand.equals("lprprk"))
        {
            commandId = R.drawable.lprprk;
        }
        else if (inputCommand.equals("all"))
        {
            commandId = R.drawable.all;
        }
        else if (inputCommand.equals("n"))
        {
            commandId = R.drawable.n;
        }
        else if (inputCommand.equals("right"))
        {
            commandId = R.drawable.right;
        }
        else if (inputCommand.equals("downright"))
        {
            commandId = R.drawable.downright;
        }
        else if (inputCommand.equals("down"))
        {
            commandId = R.drawable.down;
        }
        else if (inputCommand.equals("downleft"))
        {
            commandId = R.drawable.downleft;
        }
        else if (inputCommand.equals("left"))
        {
            commandId = R.drawable.left;
        }
        else if (inputCommand.equals("upleft"))
        {
            commandId = R.drawable.upleft;
        }
        else if (inputCommand.equals("up"))
        {
            commandId = R.drawable.up;
        }
        else if (inputCommand.equals("upright"))
        {
            commandId = R.drawable.upright;
        }
        else if (inputCommand.equals("lright"))
        {
            commandId = R.drawable.lright;
        }
        else if (inputCommand.equals("ldownright"))
        {
            commandId = R.drawable.ldownright;
        }

        return commandId;
    }
}
