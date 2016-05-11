package com.xm.weather.Api.sub;

import com.xm.weather.Model.CitylistData;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface IWeather {
    @GET("citylist")
    Observable<CitylistData> getCityList(@Query("search") String search,@Query("key") String key);
}