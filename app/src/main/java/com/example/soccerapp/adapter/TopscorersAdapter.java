package com.example.soccerapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.soccerapp.R;
import com.example.soccerapp.TopscorersModel.GoalscorersDatum;

import java.util.List;

public class TopscorersAdapter extends RecyclerView.Adapter<TopscorersAdapter.ViewHolder> {

    List<GoalscorersDatum> goalscorers;

    public TopscorersAdapter(List<GoalscorersDatum> goalscorers) {
        this.goalscorers = goalscorers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem_topscorer, parent, false);
        return new TopscorersAdapter.ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView position;
        TextView name;
        TextView goals;
        TextView country;
        public ViewHolder(@NonNull View view) {
            super(view);
            position = (TextView) view.findViewById(R.id.goalscorer_position);
            name = (TextView) view.findViewById(R.id.goalcorer_name);
            country = (TextView) view.findViewById(R.id.goalcorer_country);
            goals = (TextView) view.findViewById(R.id.goals);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GoalscorersDatum goalscorersDatum = goalscorers.get(position);
        holder.position.setText(String.valueOf(goalscorersDatum.getPosition()));
        holder.name.setText(String.valueOf(goalscorersDatum.getPlayer().getData().getFullname()));
        holder.country.setText(goalscorersDatum.getPlayer().getData().getNationality());
        holder.goals.setText(String.valueOf(goalscorersDatum.getGoals()));
    }

    @Override
    public int getItemCount() {
        return goalscorers.size();
    }
}
