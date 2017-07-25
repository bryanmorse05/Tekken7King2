package com.example.bryanmorse.tekken7king;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

//MY ADAPTER

public class MoveListData extends RecyclerView.Adapter<MoveListData.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView moveName;
        public TextView inputName;

        public ViewHolder(View itemView) {

            super(itemView);

            moveName = (TextView) itemView.findViewById(R.id.moveName);
            inputName = (TextView) itemView.findViewById(R.id.moveInput);
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

        TextView inputTextView = viewHolder.inputName;
        inputTextView.setText(moves.getInput());
    }

    @Override
    public int getItemCount() { return mMoves.size(); }
}
