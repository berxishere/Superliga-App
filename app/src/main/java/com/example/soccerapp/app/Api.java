package com.example.soccerapp.app;

import com.example.soccerapp.NewsModel.News;
import com.example.soccerapp.Standings.StandingsResult;
import com.example.soccerapp.TopscorersModel.TopscorersResult;
import com.example.soccerapp.WeatherModel.Result;
import com.example.soccerapp.model.fixtures.FixturesResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {

    @GET("standings/season/{seasonId}")
    Call<StandingsResult> getStandings(@Path("seasonId") int seasonId);

    @GET("rounds/{roundId}")
    Call<FixturesResult> getRoundWithFixtures(@Path("roundId") int roundId, @Query("include") String include);

    @GET("topscorers/season/{seasonId}")
    Call<TopscorersResult> getTopscorers(@Path("seasonId") int seasonId, @Query("include") String include);

    @GET("premium/v1/weather.ashx?key=c666475f0cad4e42aca140718192407&format=json")
    Call<Result> getWeatherConditions(@Query("q")String q,@Query("num_of_days")int num_of_days);

    // key for newsapi: 5c91532615ad457e9726de05942215a3
    @GET("v2/everything?apiKey=5c91532615ad457e9726de05942215a3")
    Call<News> getNews(@Query("q") String q,@Query("domains")String domains);

}
