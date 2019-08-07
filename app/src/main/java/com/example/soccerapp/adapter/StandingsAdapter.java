package com.example.soccerapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.soccerapp.R;
import com.example.soccerapp.Standings.StandingDatum;

import java.util.List;

public class StandingsAdapter extends RecyclerView.Adapter<StandingsAdapter.ViewHolder> {

    List<StandingDatum> standings;

    public StandingsAdapter(List<StandingDatum> standings) {
        this.standings = standings;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem_standing, parent, false);
        return  new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView position;
        TextView name;
        TextView matchesPlayed;
        TextView goalsFor;
        TextView goalsAgainst;
        TextView points;
        public ViewHolder(View view){
            super(view);
            position = (TextView) view.findViewById(R.id.position);
            name = (TextView) view.findViewById(R.id.name);
            matchesPlayed = (TextView) view.findViewById(R.id.matches_played);
            goalsFor = (TextView) view.findViewById(R.id.goals_for);
            goalsAgainst = (TextView) view.findViewById(R.id.goals_against);
            points = (TextView) view.findViewById(R.id.points);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        StandingDatum standingsDatum = standings.get(position);
        holder.position.setText(String.valueOf(standingsDatum.getPosition()));
        holder.name.setText(String.valueOf(standingsDatum.getTeamName()));
        holder.matchesPlayed.setText(String.valueOf(standingsDatum.getOverall().getGamesPlayed()));
        holder.goalsFor.setText(String.valueOf(standingsDatum.getOverall().getGoalsScored()));
        holder.goalsAgainst.setText(String.valueOf(standingsDatum.getOverall().getGoalsAgainst()));
        holder.points.setText(String.valueOf(standingsDatum.getPoints()));
    }

    @Override
    public int getItemCount() {
        return standings.size();
    }
}
