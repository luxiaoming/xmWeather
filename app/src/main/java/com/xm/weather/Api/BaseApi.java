package com.xm.weather.Api;

import com.xm.weather.Api.sub.Weather;

import xm.core.app.sub.AppService;

/**
 * Created by Administrator on 2016/3/24.
 */
public class BaseApi {
    public static void getCityList(int taskid) {
        AppService.getInstance().setSubscription(taskid, Weather.getCityList());
    }
}
