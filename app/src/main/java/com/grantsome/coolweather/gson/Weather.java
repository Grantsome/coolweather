package com.grantsome.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tom on 2017/2/10.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Suggestion suggestion;

    public Now now;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
