package com.example.soccerapp.fragment;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.soccerapp.R;
import com.example.soccerapp.RetrofitHelper;
import com.example.soccerapp.WeatherModel.CurrentCondition;
import com.example.soccerapp.WeatherModel.Data;
import com.example.soccerapp.WeatherModel.Result;
import com.example.soccerapp.WeatherModel.Weather;
import com.example.soccerapp.adapter.WeatherAdapter;
import com.example.soccerapp.app.Api;
import com.example.soccerapp.connection.ResponsesBody;

import java.util.ArrayList;
import java.util.List;

import static com.example.soccerapp.RetrofitHelper.API_URL;
import static com.example.soccerapp.RetrofitHelper.NEWS_API_URL;


public class WeatherFragment extends Fragment implements ResponsesBody {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    List<Weather> weatherMainList;

    View view;

    ProgressBar prgbar;
    Api api;
    RecyclerView recycler;
    RetrofitHelper retrofitHelper;

    public WeatherFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static WeatherFragment newInstance(String param1, String param2) {
        WeatherFragment fragment = new WeatherFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view = inflater.inflate(R.layout.fragment_weather, container, false);

        prgbar = (ProgressBar) view.findViewById(R.id.progressBar2);
        
        prgbar.setVisibility(View.VISIBLE);

        recycler = (RecyclerView) view.findViewById(R.id.recyclerweather);
        retrofitHelper = new RetrofitHelper(getActivity(),this,API_URL,NEWS_API_URL,"WEATHER");
        retrofitHelper.getWeatherConditions("48.85,2.35",2, getLondra);//LONDRA
        weatherMainList=new ArrayList<>();

        return  view;
    }


    @Override
    public void getResponseBody(Object model, int ii) {


        if(ii==getLondra){
            Result mod=(Result)model;
            if(mod.getData().getWeather()!=null){
                for (int i = 0; i <mod.getData().getWeather().size() ; i++) {
                    mod.getData().getWeather().get(i).setCity("LONDON");
                    mod.getData().getWeather().get(i).setImageUrl(mod.data.getCurrentCondition().get(0).getWeatherIconUrl().get(0).getValue());
                    weatherMainList.add(mod.data.getWeather().get(i));
                }
                retrofitHelper.getWeatherConditions("55.67,12.56",2,getKopenhag);//COPENHAGEN
            }

        }

        else if(ii==getKopenhag){
            Result mod=(Result)model;
            if(mod.getData().getWeather()!=null){
                for (int i = 0; i <mod.getData().getWeather().size() ; i++) {
                    mod.getData().getWeather().get(i).setCity("COPENHAGEN - TELIA PARKEN");
                    mod.getData().getWeather().get(i).setImageUrl(mod.data.getCurrentCondition().get(0).getWeatherIconUrl().get(0).getValue());
                    weatherMainList.add(mod.data.getWeather().get(i));
                }
                retrofitHelper.getWeatherConditions("56.11,8.95",2,getHerning);//HERNING
            }
        }

        else if(ii==getHerning){
            Result mod=(Result)model;
            if(mod.getData().getWeather()!=null){
                for (int i = 0; i <mod.getData().getWeather().size() ; i++) {
                    mod.getData().getWeather().get(i).setCity("MIDTJYLLAND - MCH ARENA");
                    mod.getData().getWeather().get(i).setImageUrl(mod.data.getCurrentCondition().get(0).getWeatherIconUrl().get(0).getValue());
                    weatherMainList.add(mod.data.getWeather().get(i));
                }
                retrofitHelper.getWeatherConditions("55.81,12.35",2,getNordsjælland);//Nordsjælland
            }
        }

        else if(ii==getNordsjælland){
            Result mod=(Result)model;
            if(mod.getData().getWeather()!= null){
                for (int i = 0; i <mod.getData().getWeather().size() ; i++) {
                    mod.getData().getWeather().get(i).setCity("NORDSJAELLAND - FARUM PARK");
                    mod.getData().getWeather().get(i).setImageUrl(mod.data.getCurrentCondition().get(0).getWeatherIconUrl().get(0).getValue());
                    weatherMainList.add(mod.data.getWeather().get(i));
                }
                retrofitHelper.getWeatherConditions("55.39,10.34",2,getOdense);//ODENSE
            }
        }

        else if(ii==getOdense){
            Result mod=(Result)model;
            if(mod.getData().getWeather()!=null){
                for (int i = 0; i <mod.getData().getWeather().size() ; i++) {
                    mod.getData().getWeather().get(i).setCity("ODENSE - TRE-FOR PARK");
                    mod.getData().getWeather().get(i).setImageUrl(mod.data.getCurrentCondition().get(0).getWeatherIconUrl().get(0).getValue());
                    weatherMainList.add(mod.data.getWeather().get(i));
                }
                retrofitHelper.getWeatherConditions("57.05,9.89",2,getAalborg);//AALBORG
            }
        }

        else if(ii==getAalborg){
            Result mod=(Result)model;
            if(mod.getData().getWeather()!=null){
                for (int i = 0; i <mod.getData().getWeather().size() ; i++) {
                    mod.getData().getWeather().get(i).setCity("AALBORG - NORDJYSKE ARENA");
                    mod.getData().getWeather().get(i).setImageUrl(mod.data.getCurrentCondition().get(0).getWeatherIconUrl().get(0).getValue());
                    weatherMainList.add(mod.data.getWeather().get(i));
                }
                retrofitHelper.getWeatherConditions("55.64,12.42",2,getBrondby);//BRONDBY
            }
        }

        else if(ii==getBrondby){
            Result mod=(Result)model;
            if(mod.getData().getWeather()!=null){
                for (int i = 0; i <mod.getData().getWeather().size() ; i++) {
                    mod.getData().getWeather().get(i).setCity("BRONDBY - STADION");
                    mod.getData().getWeather().get(i).setImageUrl(mod.data.getCurrentCondition().get(0).getWeatherIconUrl().get(0).getValue());
                    weatherMainList.add(mod.data.getWeather().get(i));
                }
                retrofitHelper.getWeatherConditions("56.13,10.19",2,getAarhus);//AARHUS
            }
        }

        else if(ii==getAarhus){
            Result mod=(Result)model;
            if(mod.getData().getWeather()!=null){
                for (int i = 0; i <mod.getData().getWeather().size() ; i++) {
                    mod.getData().getWeather().get(i).setCity("AARHUS - CERES PARK");
                    mod.getData().getWeather().get(i).setImageUrl(mod.data.getCurrentCondition().get(0).getWeatherIconUrl().get(0).getValue());
                    weatherMainList.add(mod.data.getWeather().get(i));
                }
                retrofitHelper.getWeatherConditions("55.48,8.44",2,getEsbjerg);//ESBJERG
            }
        }

        else if(ii==getEsbjerg){
            Result mod=(Result)model;
            if(mod.getData().getWeather()!=null){
                for (int i = 0; i <mod.getData().getWeather().size() ; i++) {
                    mod.getData().getWeather().get(i).setCity("ESBJERG - BLUE WATER ARENA");
                    mod.getData().getWeather().get(i).setImageUrl(mod.data.getCurrentCondition().get(0).getWeatherIconUrl().get(0).getValue());
                    weatherMainList.add(mod.data.getWeather().get(i));
                }
                showWeather(weatherMainList);
                prgbar.setVisibility(View.GONE);
            }
        }
    }

    private void showWeather(List<Weather> weather){
        WeatherAdapter adapter = new WeatherAdapter(weather);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        recycler.setAdapter(adapter);
    }

    public short getLondra=10;
    public short getKopenhag=11;
    public short getHerning=12;
    public short getNordsjælland=13;
    public short getOdense=14;
    public short getAalborg=15;
    public short getBrondby=16;
    public short getAarhus=17;
    public short getEsbjerg=18;

}
