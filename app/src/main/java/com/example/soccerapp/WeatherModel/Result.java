package com.example.soccerapp.WeatherModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {


        @SerializedName("data")
        @Expose
        public Data data;

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }


    }
