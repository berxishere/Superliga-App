package com.example.soccerapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.soccerapp.R;
import com.example.soccerapp.Standings.StandingDatum;
import com.example.soccerapp.WeatherModel.CurrentCondition;
import com.example.soccerapp.WeatherModel.Data;
import com.example.soccerapp.WeatherModel.Result;
import com.example.soccerapp.WeatherModel.Weather;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {

    List<Weather> weathers;


    public WeatherAdapter(List<Weather> weather) {
        this.weathers = weather;

    }

    @NonNull
    @Override
    public WeatherAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem_weather,parent,false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView date;
        TextView maxtempc;
        TextView mintempc;
        TextView sunhour;
        TextView cityname;
        ImageView weathericon;
        public ViewHolder(View view){
            super(view);
            date = (TextView) view.findViewById(R.id.date);
            maxtempc = (TextView) view.findViewById(R.id.maxtempc);
            mintempc = (TextView) view.findViewById(R.id.mintempc);
            sunhour = (TextView) view.findViewById(R.id.sunhour);
            weathericon = (ImageView) view.findViewById(R.id.weather_icon);
            cityname = (TextView) view.findViewById(R.id.cityname);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherAdapter.ViewHolder holder, int position) {

        Weather weather= weathers.get(position);

        holder.cityname.setText(String.valueOf(weather.getCity()));
        holder.date.setText(String.valueOf(weather.getDate()));
        holder.maxtempc.setText(String.valueOf(weather.getMaxtempC()));
        holder.mintempc.setText(String.valueOf(weather.getMintempC()));
        holder.sunhour.setText(String.valueOf(weather.getSunHour()));
        Glide.with(holder.itemView.getContext()).load(weather.getImageUrl()).into(holder.weathericon);
    }



    @Override
    public int getItemCount() {
        if(weathers!=null && weathers.size()>0){

        }return weathers.size();
        //else return 0;

    }

}
