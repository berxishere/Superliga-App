package com.example.soccerapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.soccerapp.NewsModel.News;
import com.example.soccerapp.Standings.StandingsResult;
import com.example.soccerapp.WeatherModel.Result;
import com.example.soccerapp.WeatherModel.Weather;
import com.example.soccerapp.adapter.WeatherAdapter;
import com.example.soccerapp.app.Api;
import com.example.soccerapp.connection.ResponsesBody;
import com.example.soccerapp.fragment.HomeFragment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {

    public static OkHttpClient getClient() {
        OkHttpClient.Builder b = new OkHttpClient.Builder();
        b.readTimeout(1, TimeUnit.MINUTES);
        b.writeTimeout(1, TimeUnit.MINUTES);
        return b.build();
    }
    public boolean isOnline() {
        ConnectivityManager conMgr = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        if(netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()){
            //Toast.makeText(context, "No Internet connection!", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    private Api apiInterface;
    private ProgressDialog dialog;
    //private Dialog dialog;
    Activity activity;
    ResponsesBody intfBodySend;


    RecyclerView recycler;
    Retrofit retrofit;
   public static String API_URL="http://api.worldweatheronline.com";
   public static String NEWS_API_URL = "https://newsapi.org";

    public RetrofitHelper(Activity activity,ResponsesBody intfBodySend,String API_URL,String NEWS_API_URL,String type){
        this.intfBodySend=  intfBodySend;
        this.activity=activity;
        if (API_URL!=null && !API_URL.equals("") && NEWS_API_URL!=null && !NEWS_API_URL.equals("")){
            this.API_URL=API_URL;
            this.NEWS_API_URL=NEWS_API_URL;
        }

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

     if(type.equals("WEATHER")){
         retrofit = new Retrofit.Builder().
                 client(getClient()).
                 baseUrl(this.API_URL).
                 //   baseUrl(this.NEWS_API_URL).
                         addConverterFactory(GsonConverterFactory.create(gson)).
                         build();
     }
    else{
         retrofit = new Retrofit.Builder().
                 client(getClient()).
                 baseUrl(this.NEWS_API_URL).
                         addConverterFactory(GsonConverterFactory.create(gson)).
                         build();
     }

        apiInterface = retrofit.create(Api.class);
        //dialog =ShowDialogHelper.animateDialog(activity);

    }

    public Activity getActivity(){return activity;}

    private <Result> void callRetrofit(Call<Result> call, final int i) {
        try {
            if (isOnline()) {
                call.enqueue(new Callback<Result>() {
                    @Override
                    public void onResponse(Call<Result> call, Response<Result> response) {

                        if (response!=null && response.body()!=null)
                        {
                            intfBodySend.getResponseBody(response.body(),i);

                        }

                    }
                    @Override
                    public void onFailure(Call<Result> call, Throwable t) {

                    }
                });
            }else {

            }
        }catch (Exception e){

        }

    }

    public void getWeatherConditions( String q, int day,int i){
        Call<Result> call=apiInterface.getWeatherConditions(q,day);
        callRetrofit(call,i);
    }

    public void getNews(String q,String domains, int i){
        Call<News> call=apiInterface.getNews(q,domains);
        callRetrofit(call,i);
    }

}

