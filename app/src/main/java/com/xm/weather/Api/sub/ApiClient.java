package com.xm.weather.Api.sub;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

public class ApiClient {

    private static IWeather mWeather;

    public static IWeather getCilent() {
        if (mWeather == null) {
            getWeather();
        }
        return mWeather;
    }

    private static void getWeather() {
        Retrofit retrofit0 = new Retrofit.Builder()
                .baseUrl("https://api.heweather.com/x3/")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mWeather = retrofit0.create(IWeather.class);
    }



}
