package com.xm.weather.Data;

import com.xm.weather.Model.CitylistData;

/**
 * Created by Administrator on 2016/3/24.
 */
public class CityListEvent extends Event {
    private CitylistData data;

    public CityListEvent(CitylistData data, Code status) {
        this.data = data;
        setStatus(status);
    }

    public CitylistData getData() {
        return data;
    }

    public void setData(CitylistData data) {
        this.data = data;
    }
}
