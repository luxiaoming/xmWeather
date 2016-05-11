package com.xm.weather.Api.sub;

import com.xm.weather.Data.CityListEvent;
import com.xm.weather.Data.Event;
import com.xm.weather.Model.CitylistData;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import xm.core.app.sub.AppService;

/**
 * Created by Administrator on 2016/3/19.
 */
public class Weather {
    private static String key = "dc4f32b62db841d6a086e36beea975ea";

    public static Subscription getCityList() {
        Subscription subscription = ApiClient.getCilent().getCityList("allchina", key)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<CitylistData>() {
                    @Override
                    public void onCompleted() {
                        AppService.getBus().post(new CityListEvent(null, Event.Code.Completed));
                    }

                    @Override
                    public void onError(Throwable e) {
                        AppService.getBus().post(new CityListEvent(null, Event.Code.Error));
                    }

                    @Override
                    public void onNext(CitylistData citylistData) {
                        AppService.getBus().post(new CityListEvent(citylistData, Event.Code.DoAction));
                    }
                });
        return subscription;
    }


}
