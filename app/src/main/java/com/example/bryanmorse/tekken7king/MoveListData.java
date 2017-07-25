package com.example.bryanmorse.tekken7king;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//MY ADAPTER

public class MoveListData extends RecyclerView.Adapter<MoveListData.ViewHolder> {

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
        }
    }

    private List<Moves> mMoves;

    private Context mContext;

    public MoveListData(Context context, List<Moves> moves) {
        mMoves = moves;
        mContext = context;
    }

    private Context getContext() { return mContext; }

    @Override
    public MoveListData.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View movesView = inflater.inflate(R.layout.activity_move_list_data, parent, false);

        ViewHolder viewHolder = new ViewHolder(movesView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MoveListData.ViewHolder viewHolder, int position) {

        final Moves moves = mMoves.get(position);

        TextView textView = viewHolder.moveName;
        textView.setText(moves.getName());

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

    }

    @Override
    public int getItemCount() { return mMoves.size(); }

    public int sortingThroughInputCommands(String inputCommand) {
        int commandId = 0;
        if(inputCommand == "lp")
        {
            commandId = R.drawable.lp;
        }
        else if (inputCommand == "rp")
        {
            commandId = R.drawable.rp;
        }
        else if (inputCommand == "lk")
        {
            commandId = R.drawable.lk;
        }
        else if (inputCommand == "rk")
        {
            commandId = R.drawable.rk;
        }
        else if (inputCommand == "lprp")
        {
            commandId = R.drawable.lprp;
        }
        else if (inputCommand == "lkrk")
        {
            commandId = R.drawable.lkrk;
        }
        else if (inputCommand == "lplk")
        {
            commandId = R.drawable.lplk;
        }
        else if (inputCommand == "rprk")
        {
            commandId = R.drawable.rprk;
        }
        else if (inputCommand == "lprk")
        {
            commandId = R.drawable.lprk;
        }
        else if (inputCommand == "rplk")
        {
            commandId = R.drawable.rplk;
        }
        else if (inputCommand == "n")
        {
            commandId = R.drawable.n;
        }
        else if (inputCommand == "right")
        {
            commandId = R.drawable.right;
        }
        else if (inputCommand == "downright")
        {
            commandId = R.drawable.downright;
        }
        else if (inputCommand == "down")
        {
            commandId = R.drawable.down;
        }
        else if (inputCommand == "downleft")
        {
            commandId = R.drawable.downleft;
        }
        else if (inputCommand == "left")
        {
            commandId = R.drawable.left;
        }
        else if (inputCommand == "upleft")
        {
            commandId = R.drawable.upleft;
        }
        else if (inputCommand == "up")
        {
            commandId = R.drawable.up;
        }
        else if (inputCommand == "upright")
        {
            commandId = R.drawable.upright;
        }

        return commandId;
    }
}
