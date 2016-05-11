package com.xm.weather.Model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/3/19.
 */


public class CitylistData implements Serializable {
    private List<City_info> city_info;
    private String status;

    public List<City_info> getCity_info() {
        return this.city_info;
    }

    public void setCity_info(List<City_info> city_info) {
        this.city_info = city_info;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    private class City_info {
        private String city;

        private String cnty;

        private String id;

        private String lat;

        private String lon;

        private String prov;

        public String getCity() {
            return this.city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCnty() {
            return this.cnty;
        }

        public void setCnty(String cnty) {
            this.cnty = cnty;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLat() {
            return this.lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return this.lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getProv() {
            return this.prov;
        }

        public void setProv(String prov) {
            this.prov = prov;
        }

    }
}
