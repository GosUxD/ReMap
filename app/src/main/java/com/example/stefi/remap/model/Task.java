package com.example.stefi.remap.model;

import android.location.Location;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Stefi on 19.01.2017.
 */

public class Task extends RealmObject {

     private String description;
     private String data;
     private String vreme;
    private String lat;
    private String lon;


    public Task() {
    }

    public Task(String descriotion, String data, String vreme, String lat, String lon) {
        this.description = descriotion;
        this.data = data;
        this.vreme = vreme;
        this.lat = lat;
        this.lon = lon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}
